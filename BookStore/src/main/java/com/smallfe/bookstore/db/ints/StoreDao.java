/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.db.ints;

import com.smallfe.bookstore.db.entity.Book;
import java.util.List;

/**
 *
 * @author mehmetkucukdemir
 */
public interface StoreDao extends DAO<Book> {
    public List<Book> getAllBooks();

    public void testConnection();

    public void save(Book book);
}