/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mehmetkucukdemir
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration()
					.configure("/hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
}
}
