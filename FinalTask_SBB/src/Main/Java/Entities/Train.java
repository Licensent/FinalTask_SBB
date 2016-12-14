package Entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    @OneToMany(mappedBy = "trip")
    private List<Trip> tripList;



}
