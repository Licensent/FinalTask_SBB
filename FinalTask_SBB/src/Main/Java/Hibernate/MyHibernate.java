package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by DarthVader on 18.12.2016.
 */
public class MyHibernate {
    private static final String PERSISTENT_UNIT_NAME = "SBB";

    private static final EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);

        }
    }
    private static EntityManager entityManager = emf.createEntityManager();

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void getEntityTransactionBegin() {
        entityManager.getTransaction().begin();
    }

    public static void getEntityTransactionCommit() {
        entityManager.getTransaction().commit();
    }


    public static void close(){emf.close();}
}
