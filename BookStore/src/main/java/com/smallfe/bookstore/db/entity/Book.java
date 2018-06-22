/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.db.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author mehmetkucukdemir
 */
@Entity
@Table(name="BOOKSTORE.BOOK")
public class Book implements Serializable {

    public Book(String title, String author, String isbn, String type, Date publishDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.type = type;
        this.publishDate = publishDate;
    }
    
    @Id
    @SequenceGenerator(name="BOOK_SEQ", sequenceName="SEQ_BOOK_ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "BOOK_SEQ")
    @Column(name="ID")
    private Long id;

    @Column(name="TITLE")
    private String title;
    
    @Column(name="AUTHOR")
    private String author;
    
    @Column(name="ISBN")
    private String isbn;
    
    @Column(name="TYPE")
    private String type;
    
    @Column(name="PUBLISH_DATE")
    private Date publishDate;
    
}
