/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.db.impl;

import com.smallfe.bookstore.db.HibernateUtil;
import com.smallfe.bookstore.db.entity.Book;
import com.smallfe.bookstore.db.ints.StoreDao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mehmetkucukdemir
 */
@Repository
public class StoreDaoImpl implements StoreDao {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public List<Book> getAllBooks() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Book> bookList = session.createQuery("from Book").list();
        session.getTransaction().commit();
        session.close();
        return bookList;
    }

    @Override
    public void create(Book entity) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void delete(Book entity) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public List<Book> getAll() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public <T> T getById(Long id) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void update(Book entity) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public List<Book> selectPage(int start, int count) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public Long countAll() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public Integer deleteAll() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void testConnection() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "SELECT 1 FROM DUAL";
        NativeQuery query = session.createNativeQuery(sql);
        query.list();
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void save(Book book) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }
    
}
