package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.service.GeneralServiceInterface;

public abstract class AbstractController<T, Integer> implements GeneralServiceController<T, Integer> {

    @Override
    public abstract GeneralServiceInterface<T, Integer> getService();

    @Override
    @GetMapping("")
    public List<T> findAll() throws SQLException {
        return getService().findAll();
    }

    @Override
    @GetMapping(path = "/{id}")
    public T find(final @PathVariable("id")Integer id) throws SQLException {
        return (T) getService().find(id);
    }

    @Override
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id) throws SQLException {
        getService().delete(id);
    }

    @Override
    @PutMapping(path ="")
    public void update(@RequestBody T entity) throws SQLException {
        getService().update(entity);
    }

    @Override
    @PostMapping(path ="")
    public void create(@RequestBody T entity) throws SQLException {
        getService().create(entity);
    }

}