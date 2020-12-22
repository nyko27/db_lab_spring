package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T, Integer> implements GeneralServiceInterface<T, Integer> {

    @Override
    public abstract JpaRepository<T, Integer> getRepository();

    @Override
    public List<T> findAll() throws SQLException {
        return getRepository().findAll();
    }

    @Override
    public T find(Integer id) throws SQLException {
        return (T) getRepository().findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        getRepository().deleteById(id);
    }

    @Override
    public void update(T entity) throws SQLException {
        getRepository().save(entity);
    }

    @Override
    public void create(T entity) throws SQLException {
        getRepository().save(entity);
    }

}
