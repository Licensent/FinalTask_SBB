package service;

import dao.RouteDao;
import dao.StationDao;
import dao.TimetableDao;
import dao.TrainDao;
import entities.Route;
import entities.Station;
import entities.Timetable;
import entities.Train;
import hibernate.MyHibernate;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by DarthVader on 02.01.2017.
 */
public class AdminService {

    private StationDao stationDao = new StationDao();
    private RouteDao routeDao = new RouteDao();
    private TrainDao trainDao = new TrainDao();
    private TimetableDao timetableDao = new TimetableDao();

    public void addStation(String stationName) {
        MyHibernate.getEntityTransactionBegin();
        Station station = new Station(stationName);
        stationDao.add(station);
        MyHibernate.getEntityTransactionCommit();

    }

    public void addRoute(int routeNumber) {
        MyHibernate.getEntityTransactionBegin();
        Route route = new Route(routeNumber);
        routeDao.add(route);
        MyHibernate.getEntityTransactionCommit();
    }

    public void addTrain(int trainNumber) {
        MyHibernate.getEntityTransactionBegin();
        Route route = new Route(trainNumber);
        Train train = new Train();
        route.setTrainAndRouteNumber(trainNumber);
        routeDao.add(route);
        train.setRoute(route);
        trainDao.add(train);
        MyHibernate.getEntityTransactionCommit();
    }

    public void addTimetable(String timetableForStationName) {
        MyHibernate.getEntityTransactionBegin();

        Timetable timetable = new Timetable();
        Station stationName = null;
        timetableDao.add(timetable);

        try {
            if (stationDao.getStationByName(timetableForStationName) == null) {

                stationName = new Station(timetableForStationName);
                ArrayList<Timetable> timetableList = new ArrayList<>(Arrays.asList(timetable));

                stationName.setTimetableList(timetableList);
                stationDao.add(stationName);


            } else {

                stationName = stationDao.getStationByName(timetableForStationName);
                ArrayList<Timetable> timetableList = new ArrayList<>(Arrays.asList(timetable));

                stationName.setTimetableList(timetableList);
                stationDao.update(stationName);
            }
            MyHibernate.getEntityTransactionCommit();
        } catch (NoResultException e) {
            e.printStackTrace();
            if (MyHibernate.getEntityManager().getTransaction().isActive()) {
                MyHibernate.getEntityManager().getTransaction().rollback();
            }
        }

    }
}
