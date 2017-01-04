package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Timetable")
public class Timetable extends BaseEntity implements Serializable {
    @Column(name = "Arrive")
    private Date arrive;
    @Column(name = "Departure")
    private Date departure;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Train_Id")
    private Train train;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Station_Id")
    private Station station;

    public Timetable() {
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