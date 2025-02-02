package dev.edu.picbay.service;

import java.util.List;

public interface CrudService<ID, T> {

    T findById(ID id);
    List<T> findAll();
    T create(T entidade);
    T update(ID id, T entidade);
    void delete(ID id);
}
