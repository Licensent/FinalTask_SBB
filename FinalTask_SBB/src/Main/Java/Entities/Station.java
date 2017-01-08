package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Station", uniqueConstraints = @UniqueConstraint(columnNames = "StationName"))
public class Station extends BaseEntity implements Serializable {

    @Column(name = "StationName")
    private String stationName;

    @OneToMany(mappedBy = "station")
    private List<Timetable> timetableList;

    @ManyToMany(mappedBy = "stationList")
    private List<Route> routeList;

    @ManyToMany
    @JoinTable(name = "Sation_x_Trip",
            joinColumns = @JoinColumn(name = "Station_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Trip_Id", referencedColumnName = "Id")
    )
    private List<Trip> tripList;

    protected Station() {
    }

    public Station(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Timetable> getTimetableList() {
        return timetableList;
    }

    public void setTimetableList(List<Timetable> timetableList) {
        this.timetableList = timetableList;
    }

    public List<Route> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<Route> routeList) {
        this.routeList = routeList;
    }

    public List<Trip> getTripList() {
        return tripList;
    }

    public void setTripList(List<Trip> tripList) {
        this.tripList = tripList;
    }

    public String toString(){
        return stationName;
    }
}
