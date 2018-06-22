/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.db.ints;

import java.util.List;

/**
 *
 * @author mehmetkucukdemir
 */
public interface DAO<T> {

	void create(T entity);
	void delete(T entity);
        List<T> getAll();
	<T> T getById(Long id);
	void update(T entity);
	List<T> selectPage(int start, int count);
	Long countAll();
	Integer deleteAll();
}
