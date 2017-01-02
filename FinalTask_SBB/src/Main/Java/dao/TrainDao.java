package dao;

import entities.Train;

import javax.persistence.Query;

/**
 * Created by DarthVader on 22.12.2016.
 */
public class TrainDao extends AbstractDao<Train> {
    public Query getTrain(){
        manager.getTransaction().begin();
        Query query = manager.createQuery("select s.routeList from Station s " +
                "where s.stationName = :FromStationNameParameter and " +
                "select s.routeList from Station s " +
                "where s.stationName = :ToStationNameParameter");
        return null;
    }
}
