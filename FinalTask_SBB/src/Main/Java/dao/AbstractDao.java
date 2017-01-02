package dao;

import hibernate.MyHibernate;
import entities.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by DarthVader on 20.12.2016.
 */
public class AbstractDao<T extends BaseEntity> implements Dao<T> {
    EntityManager manager = MyHibernate.getEm();
    Class<T> tClass;

    public AbstractDao() {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        tClass = (Class) pt.getActualTypeArguments()[0];
    }

    public void add(T type) {
        try {
            manager.getTransaction().begin();
            manager.persist(type);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(T type) {
        try {
            manager.getTransaction().begin();
            manager.merge(type);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(T type) {
        try {
            manager.getTransaction().begin();
            BaseEntity entity = manager.getReference(type.getClass(), type.getId());
            manager.remove(entity);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public T getObjectById(Long id) {
        T typeClass = null;
        try {
            manager.getTransaction().begin();
            typeClass = manager.find(tClass, id);
            manager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeClass;

    }

    public List<T> getAll() {
        manager.getTransaction().begin();
        TypedQuery<T> namedQuery = manager.createNamedQuery("from " + tClass.getName(), tClass);
        List<T> resultList = namedQuery.getResultList();
        manager.getTransaction().commit();
        return resultList;
    }
}