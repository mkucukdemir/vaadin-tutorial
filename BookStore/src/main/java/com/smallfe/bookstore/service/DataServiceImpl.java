/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.service;

import com.smallfe.bookstore.db.entity.Book;
import com.smallfe.bookstore.db.impl.StoreDaoImpl;
import com.smallfe.bookstore.db.ints.StoreDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mehmetkucukdemir
 */
@Service
@Transactional
public class DataServiceImpl implements DataService {
    
    StoreDao storeDao = new StoreDaoImpl();

    @Override
    public void testConnection() {
        storeDao.testConnection();
    }

    @Override
    public void save(Book book) {
        storeDao.save(book);
    }
    
}
