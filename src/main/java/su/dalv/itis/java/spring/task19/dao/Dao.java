package su.dalv.itis.java.spring.task19.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface Dao<T> {

    T findByid(long id);

    void insert(T t);

    void delete(T t);

}
