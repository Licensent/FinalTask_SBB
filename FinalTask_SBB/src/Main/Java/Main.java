import hibernate.MyHibernate;
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

        Passenger passenger1 = new Passenger();
        passenger1.setName("a");
        passenger1.setSurname("b");
        passenger1.setLastName("c");
        passengerDao.add(passenger1);

        Passenger passenger2 = new Passenger();
        passenger2.setName("g");
        passenger2.setSurname("h");
        passenger2.setLastName("j");
        passengerDao.add(passenger2);

        TicketDao ticketDao = new TicketDao();

        Ticket ticket1 = new Ticket();
        ticket1.setPassenger(passenger1);
        ticketDao.add(ticket1);
//        ticketDao.getTicketByNSL("a", "b", "c");

        Ticket ticket2 = new Ticket();
        ticket2.setPassenger(passenger2);
        ticketDao.add(ticket2);
//        ticketDao.getTicketByNSL("a", "b", "c");


        MyHibernate.close();

    }
}
