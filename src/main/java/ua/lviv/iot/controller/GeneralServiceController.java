package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.iot.service.GeneralServiceInterface;

public interface GeneralServiceController<T, ID> {

    List<T> findAll() throws SQLException;

    T find(ID id) throws SQLException;

    void delete(ID id) throws SQLException;

    void update(T entity) throws SQLException;

    void create(T entity) throws SQLException;

    GeneralServiceInterface<T, ID> getService();

}