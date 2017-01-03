package service;

import dao.RouteDao;
import dao.StationDao;
import dao.TrainDao;
import entities.Route;
import entities.Station;
import entities.Train;

/**
 * Created by DarthVader on 02.01.2017.
 */
public class AdminService {

    private StationDao stationDao = new StationDao();
    private RouteDao routeDao = new RouteDao();
    private TrainDao trainDao = new TrainDao();

    public void addStation(String stationName) {
        Station station = new Station(stationName);
        stationDao.add(station);
    }

    public void addTrain(int trainNumber) {
        Route route = new Route(trainNumber);
        Train train = new Train();
        route.setTrainAndRouteNumber(trainNumber);
        routeDao.add(route);
        train.setRoute(route);
        trainDao.add(train);
    }
}
