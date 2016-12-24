package service;

import dao.TicketDao;

/**
 * Created by DarthVader on 22.12.2016.
 */
public class ServiceForWeb {
    TicketDao ticket = new TicketDao();

//    public Ticket getTicket(String name, String surname, String lastname) {
//
//    }

    public void setTicket(TicketDao ticket) {
        this.ticket = ticket;
    }
}
