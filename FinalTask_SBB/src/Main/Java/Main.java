import Hibernate.MyHibernate;
import dao.PassengerDao;
import dao.TicketDao;
import entities.Passenger;
import entities.Ticket;

/**
 * Created by DarthVader on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        PassengerDao passengerDao = new PassengerDao();
        Passenger passenger = new Passenger();
        passenger.setName("a");
        passenger.setSurname("b");
        passenger.setLastName("c");
        passengerDao.add(passenger);

        Ticket ticket = new Ticket();
        ticket.setPassenger(passenger);
        TicketDao ticketDao = new TicketDao();
        ticketDao.add(ticket);
        ticketDao.getTicketByNSL("a","b","c");

        MyHibernate.close();

    }
}
