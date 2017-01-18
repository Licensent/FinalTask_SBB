package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DarthVader on 12.12.2016.
 */
@Entity
@Table(name = "Train")
public class Train extends BaseEntity implements Serializable{
    @OneToMany(mappedBy = "train")
    private List<Place> placeList;
    @OneToMany(mappedBy = "train")
    private List<Trip> tripList;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Route_Id")
    private Route route;
//    еще раз подумать  об отношении поезда и расписания
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "train")
    private Timetable timetable;

    public Train() {
    }

    public List<Place> getPlaceList() {
        return placeList;
    }

    public void setPlaceList(List<Place> placeList) {
        this.placeList = placeList;
    }

    public List<Trip> getTripList() {
        return tripList;
    }

    public void setTripList(List<Trip> tripList) {
        this.tripList = tripList;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }
}
