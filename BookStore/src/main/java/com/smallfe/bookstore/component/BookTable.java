/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.component;

import com.smallfe.bookstore.db.entity.Book;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanContainer;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mehmetkucukdemir
 */
public class BookTable extends VerticalLayout {

    public BookTable(List<Book> bookList) {
        this.setHeight("400px");
        BeanContainer<Long, Book> books = new BeanContainer<Long, Book>(Book.class);
        books.setBeanIdProperty("id");
        
        books.addAll(bookList);
        
        Table table = new Table("Book list of the store"){
            @Override
            protected String formatPropertyValue(Object rowId, Object colId, Property property) {
                if (property.getType() == Date.class) {
                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    return df.format((Date)property.getValue());
                }
                return super.formatPropertyValue(rowId, colId, property);
            }
        };
        table.setContainerDataSource(books);
        table.setColumnHeader("title", "Title");
        table.setColumnHeader("author", "Author");
        table.setColumnHeader("isbn", "ISBN");
        table.setColumnHeader("type", "Type");
        table.setColumnHeader("publishDate", "Publish Date");
        table.setVisibleColumns(new Object[] {"title","author","isbn","type","publishDate"});
        table.setSizeFull();
        
        addComponent(table);
        
    }
    
}
