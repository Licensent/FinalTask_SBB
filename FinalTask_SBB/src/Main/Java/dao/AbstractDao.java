package dao;

import entities.BaseEntity;
import hibernate.MyHibernate;

import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by DarthVader on 20.12.2016.
 */
public class AbstractDao<T extends BaseEntity> implements Dao<T> {
       Class<T> tClass;

    public AbstractDao() {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        tClass = (Class) pt.getActualTypeArguments()[0];
    }

    public void add(T type) {
        try {

            MyHibernate.getEntityManager().persist(type);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(T type) {
        try {

            MyHibernate.getEntityManager().merge(type);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(T type) {
        try {

            BaseEntity entity = MyHibernate.getEntityManager().
                    getReference(type.getClass(), type.getId());
            MyHibernate.getEntityManager().remove(entity);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public T getObjectById(Long id) {
        T typeClass = null;
        try {

            typeClass = MyHibernate.getEntityManager().find(tClass, id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeClass;

    }

    public List<T> getAll() {

        TypedQuery<T> namedQuery = MyHibernate.getEntityManager().
                createNamedQuery("from " + tClass.getName(), tClass);
        List<T> resultList = namedQuery.getResultList();

        return resultList;
    }
}