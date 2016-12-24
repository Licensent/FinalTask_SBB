package entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Place")
public class Place extends BaseEntity implements Serializable {
//    @Column(name = "PlaceNumber")
//    private int placeNumber;
//    @Column(name = "PlaceStatus")
//    private String placeStatus;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Train_Id")
//    private Train train;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Trip_Id")
//    private Trip trip;

}
