package entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table (name = "Trip")
public class Trip extends BaseEntity implements Serializable {
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Train_Id")
//    private Train train;
//
//    @OneToMany(mappedBy = "trip")
//    private List<Place> placeList;
//    @ManyToMany(mappedBy = "tripList")
//    private List<Station> stationList;

}
