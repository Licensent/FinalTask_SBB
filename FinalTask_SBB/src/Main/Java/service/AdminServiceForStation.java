package service;

import dao.StationDao;
import entities.Station;

/**
 * Created by DarthVader on 02.01.2017.
 */
public class AdminServiceForStation {
    StationDao stationDao = new StationDao();
    Station station = new Station();

    public void addStation(String stationName) {
        station.setStationName(stationName);
        stationDao.add(station);

    }


}
