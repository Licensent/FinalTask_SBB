package dao;

import entities.Station;
import hibernate.MyHibernate;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 * Created by DarthVader on 22.12.2016.
 */
public class StationDao extends AbstractDao<Station> {
    public Station getStationByName(String stationName) throws NoResultException {

        Station station = null;
        TypedQuery<Station> namedQuery = MyHibernate.getEntityManager().
                createQuery("select s from Station s " +
                "where s.stationName = :stationParameter ", Station.class);
        namedQuery.setParameter("stationParameter", stationName);

        try {
            station = namedQuery.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
        return station;
    }
}
