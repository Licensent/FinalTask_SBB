package service;

import dao.TrainDao;
import entities.Route;
import entities.Train;

/**
 * Created by DarthVader on 02.01.2017.
 */
public class AdminServiceForTrain {
    TrainDao trainDao = new TrainDao();
    Route route = new Route();
    Train train = new Train();

    public void addTrain(int trainNumber) {
        route.setTrainAndRouteNumber(trainNumber);
        train.setRoute(route);
    }
}
