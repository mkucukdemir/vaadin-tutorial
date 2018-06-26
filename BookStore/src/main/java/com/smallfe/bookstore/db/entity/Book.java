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

    public Book() {
    }
    

    public Book(String title, String author, String isbn, String type, Date publishDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.type = type;
        this.publishDate = publishDate;
    }
    
    @Id
    @SequenceGenerator(name="BOOK_SEQ", sequenceName="SEQ_BOOK_ID",allocationSize = 1)
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

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the publishDate
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * @param publishDate the publishDate to set
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    
}
