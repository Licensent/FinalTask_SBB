package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table (name = "Trip")
public class Trip extends BaseEntity implements Serializable {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Train_Id")
    private Trip trip;

}
