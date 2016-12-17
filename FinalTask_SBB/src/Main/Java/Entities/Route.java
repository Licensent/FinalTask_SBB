package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Route")
public class Route extends BaseEntity implements Serializable {
    @Column(name = "Train_And_Route_Number")
    private int trainAndRouteNumber;
    @OneToMany(mappedBy = "route")
    private List<Train> trainList;
    @ManyToMany
    @JoinTable(
            name = "Route_x_Station",
            joinColumns = @JoinColumn(name = "Route_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Station_Id", referencedColumnName = "Id"))
    private List<Station> stationList;



}
