package dao;

import java.util.List;

/**
 * Created by DarthVader on 18.12.2016.
 */
public interface Dao<T> {
    void add(T type);
    void delete(T type);
    void update(T type);
    T getObjectById(Long id);
    List<T> getAll();
}
