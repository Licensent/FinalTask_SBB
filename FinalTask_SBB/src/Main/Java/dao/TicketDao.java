package dao;

import entities.Ticket;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by DarthVader on 22.12.2016.
 */
public class TicketDao extends AbstractDao<Ticket>{
    public Query getTicketByNSL(String name, String surname, String lastname){
        manager.getTransaction().begin();
//        Query query = manager.createQuery("select t from Ticket t" +
//                " where t.passenger.name = :nameParameter and  " +
//                "t.passenger.surname = :surnameParameter and " +
//                "t.passenger.lastname = :lastnameParameter");
        Query query = manager.createQuery("select t from Ticket t " +
                "left join t.passenger passenger " +
                "where passenger.name = :nameParameter and  " +
                "passenger.surname = :surnameParameter and " +
                "passenger.lastName = :lastnameParameter");

        query.setParameter("nameParameter", name);
        query.setParameter("surnameParameter", surname);
        query.setParameter("lastnameParameter", lastname);
        query.getResultList();
        System.out.println(query.getResultList());
        manager.getTransaction().commit();
        return query;
    }

}
