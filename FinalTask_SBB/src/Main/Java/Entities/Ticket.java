package entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DarthVader on 11.12.2016.
 */
@Entity
@Table(name = "Ticket")
public class Ticket extends BaseEntity implements Serializable {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Passenger_Id")
    private Passenger passenger;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Route_Id")
    private Route route;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Trip_Id")
    private Trip trip;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Place_Id")
    private Place trainPlace;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Place getTrainPlace() {
        return trainPlace;
    }

    public void setTrainPlace(Place trainPlace) {
        this.trainPlace = trainPlace;
    }
    public String toString(){
        return "Passenger "+ passenger;
    }
}
