package entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Place")
public class Place extends BaseEntity implements Serializable {
    @Column(name = "PlaceNumber")
    private int placeNumber;
    @Column(name = "PlaceStatus")
    private String placeStatus;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Train_Id")
    private Train train;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Trip_Id")
    private Trip trip;

    public Place() {
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(String placeStatus) {
        this.placeStatus = placeStatus;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
