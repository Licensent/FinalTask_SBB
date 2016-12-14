package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

}
