package dao;

import Hibernate.Hibernate;

import javax.persistence.EntityManager;

/**
 * Created by DarthVader on 18.12.2016.
 */
public class AbstractDao {
    EntityManager maneger =Hibernate.getEmf();
}

