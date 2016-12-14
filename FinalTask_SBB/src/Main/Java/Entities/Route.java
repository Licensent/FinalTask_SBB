package Entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Route")
public class Route extends BaseEntity implements Serializable {
}
