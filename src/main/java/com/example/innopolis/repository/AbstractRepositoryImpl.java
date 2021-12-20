package com.example.innopolis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractRepositoryImpl<T extends Serializable> implements AbstractRepository<T> {

    protected abstract EntityRepository getRepository();

    protected abstract String getTable();

    protected abstract Class<T> getEntityClass();

    @PersistenceContext(unitName = "entityManagerFactory")
    protected EntityManager entityManager;

    @Override
    public List<T> getAll() {
        return entityManager.createQuery("SELECT u FROM " + getTable() + " u").getResultList();
    }

    @Override
    public T getById(Long id) {
        return entityManager.find(getEntityClass(), id);
    }
//
//    @Override
//    public void update(T t) {
//
//    }
//
//    @Override
//    public void delete(T t) {
//
//    }
}
