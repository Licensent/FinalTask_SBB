package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Station")
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

}
