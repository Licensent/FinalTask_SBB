package dao;

import entities.Ticket;
import hibernate.MyHibernate;

import javax.persistence.Query;

/**
 * Created by DarthVader on 22.12.2016.
 */
public class TicketDao extends AbstractDao<Ticket> {
    public Query getTicketByNSL(String name, String surname, String lastname) {

        Query query = MyHibernate.getEntityManager().createQuery("select t from Ticket t " +
                "left join t.passenger passenger " +
                "where passenger.name = :nameParameter and  " +
                "passenger.surname = :surnameParameter and " +
                "passenger.lastName = :lastnameParameter");

        query.setParameter("nameParameter", name);
        query.setParameter("surnameParameter", surname);
        query.setParameter("lastnameParameter", lastname);
        query.getResultList();
        System.out.println(query.getResultList());
        return query;
    }

}
