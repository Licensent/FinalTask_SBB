package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Timetable", uniqueConstraints = @UniqueConstraint(name = "UC_ARRIVE_DATE",
        columnNames = {Timetable.ARRIVE_DATE, Timetable.DEPARTURE_DATE}))
public class Timetable extends BaseEntity implements Serializable {

    public static final String ARRIVE_DATE = "Arrive";
    public static final String DEPARTURE_DATE = "Departure";

    @Column(name = ARRIVE_DATE)
    private Date arrive;
    @Column(name = DEPARTURE_DATE)
    private Date departure;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Train_Id")
    private Train train;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Station_Id")
    private Station station;

    public Timetable() {
    }

    public Date getArrive() {
        return arrive;
    }

    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}