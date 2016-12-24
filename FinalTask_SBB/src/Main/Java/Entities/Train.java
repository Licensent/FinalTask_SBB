package entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by DarthVader on 12.12.2016.
 */
@Entity
@Table(name = "Train")
public class Train extends BaseEntity implements Serializable{
//    @OneToMany(mappedBy = "train")
//    private List<Place> placeList;
//    @OneToMany(mappedBy = "train")
//    private List<Trip> tripList;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Route_Id")
//    private Route route;
//    @OneToOne(fetch = FetchType.EAGER, mappedBy = "train")
//    private Timetable timetable;

}
