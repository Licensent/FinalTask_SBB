package Entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table(name = "Timetable")
public class Timetable extends BaseEntity implements Serializable {
    @Column(name = "Arrive")
    private Data arrive;
    @Column(name = "Departure")
    private Data departure;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Train_Id")
    private Train train;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Station_Id")
    private Station station;
}