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
@Table(name = "Station")
public class Station extends BaseEntity implements Serializable {
    @Column(name = "StationName")
    private String stationName;
    @OneToMany(mappedBy = "station")
    private List<Timetable> timetableList;
}
