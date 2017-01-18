package dao;

import entities.Route;
import hibernate.MyHibernate;

import javax.persistence.TypedQuery;

/**
 * Created by DarthVader on 22.12.2016.
 */
public class RouteDao extends AbstractDao<Route>{
    public Route getRouteByNumber(int routeNumber){
        Route route = null;

        TypedQuery<Route> namedQuery = MyHibernate.getEntityManager().
                createQuery("select r from Route r " +
                        "where r.trainAndRouteNumber = :routeParameter", Route.class);
        namedQuery.setParameter("routeParameter", routeNumber);

        try {
            route = namedQuery.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
        return route;
    }
}
