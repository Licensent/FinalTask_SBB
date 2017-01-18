package service;

import dao.*;
import entities.*;
import hibernate.MyHibernate;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DarthVader on 02.01.2017.
 */
public class AdminService {

    private StationDao stationDao = new StationDao();
    private RouteDao routeDao = new RouteDao();
    private TrainDao trainDao = new TrainDao();
    private TimetableDao timetableDao = new TimetableDao();
    private PlaceDao placeDao = new PlaceDao();

    public void addStation(String stationName) {
        MyHibernate.getEntityTransactionBegin();

        Station station = null;

        try {
            if (stationDao.getStationByName(stationName) == null) {
                station = new Station(stationName);
                stationDao.add(station);
            } else {
                station = stationDao.getStationByName(stationName);
                stationDao.update(station);
            }
            MyHibernate.getEntityTransactionCommit();
        } catch (NoResultException e) {
            e.printStackTrace();
            if (MyHibernate.getEntityManager().getTransaction().isActive()) {
                MyHibernate.getEntityManager().getTransaction().rollback();
            }
        }
    }

    public void addRoute(int routeNumber) {
        MyHibernate.getEntityTransactionBegin();

        Route route = null;

        try {
            if (routeDao.getRouteByNumber(routeNumber) == null) {

                route = new Route(routeNumber);

                routeDao.add(route);
            } else {
                route = routeDao.getRouteByNumber(routeNumber);

                routeDao.update(route);
            }
            MyHibernate.getEntityTransactionCommit();
        } catch (Exception e) {
            e.printStackTrace();
            if (MyHibernate.getEntityManager().getTransaction().isActive()) {
                MyHibernate.getEntityManager().getTransaction().rollback();
            }
        }
    }

    public void addTrain(int trainNumber, int totalPlaces) {
        MyHibernate.getEntityTransactionBegin();

        Train train = new Train();
        Route route = null;
        List<Place> placeList = new ArrayList<>();
        if (totalPlaces <= 10) {
            placeList = setPlaces(10);
        } else {
            placeList = setPlaces(totalPlaces);
        }


        try {
            if (routeDao.getRouteByNumber(trainNumber) == null) {

                route = new Route(trainNumber);

                routeDao.add(route);
                train.setRoute(route);
                trainDao.add(train);
                for (Place place : placeList) {
                    place.setTrain(train);
                    placeDao.add(place);
                }

            } else {

                route = routeDao.getRouteByNumber(trainNumber);

                train.setRoute(route);
                trainDao.add(train);
                for (Place place : placeList) {
                    place.setTrain(train);
                    placeDao.add(place);
                }
            }
            MyHibernate.getEntityTransactionCommit();
        } catch (Exception e) {
            e.printStackTrace();
            if (MyHibernate.getEntityManager().getTransaction().isActive()) {
                MyHibernate.getEntityManager().getTransaction().rollback();
            }
        }
    }

    public void addTimetable(String timetableForStationName) {
        MyHibernate.getEntityTransactionBegin();

        Timetable timetable = new Timetable();
        Station stationName = null;

        try {
            if (stationDao.getStationByName(timetableForStationName) == null) {

                stationName = new Station(timetableForStationName);
                stationDao.add(stationName);

                timetable.setStation(stationName);
                timetableDao.add(timetable);
            } else {
                stationName = stationDao.getStationByName(timetableForStationName);

                timetable.setStation(stationName);
                timetableDao.add(timetable);
            }
            MyHibernate.getEntityTransactionCommit();
        } catch (NoResultException e) {
            e.printStackTrace();
            if (MyHibernate.getEntityManager().getTransaction().isActive()) {
                MyHibernate.getEntityManager().getTransaction().rollback();
            }
        }

    }

    private List<Place> setPlaces(int totalPlaces) {
        List<Place> placeList = new ArrayList<>();
        for (int i = 1; i <= totalPlaces; i++) {
            Place place = new Place();
            place.setPlaceStatus("Free");
            place.setPlaceNumber(i);
            placeList.add(place);
        }
        return placeList;
    }
}
