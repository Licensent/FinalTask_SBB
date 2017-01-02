package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by DarthVader on 14.12.2016.
 */
@Entity
@Table (name = "Trip")
public class Trip extends BaseEntity implements Serializable {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Train_Id")
    private Train train;

    @OneToMany(mappedBy = "trip")
    private List<Place> placeList;
    @ManyToMany(mappedBy = "tripList")
    private List<Station> stationList;

    public Trip() {
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public List<Place> getPlaceList() {
        return placeList;
    }

    public void setPlaceList(List<Place> placeList) {
        this.placeList = placeList;
    }

    public List<Station> getStationList() {
        return stationList;
    }

    public void setStationList(List<Station> stationList) {
        this.stationList = stationList;
    }
}
