package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface GeneralServiceInterface<T, Integer> {

    List<T> findAll() throws SQLException;

    T find(Integer id) throws SQLException;

    void delete(Integer id) throws SQLException;

    void update(T entity) throws SQLException;

    void create(T entity) throws SQLException;

    JpaRepository<T, Integer> getRepository();

}