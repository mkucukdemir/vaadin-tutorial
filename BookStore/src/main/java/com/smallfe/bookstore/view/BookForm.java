/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.view;

import com.smallfe.bookstore.component.BookPublishDateField;
import com.smallfe.bookstore.component.BookTypeSelect;
import com.smallfe.bookstore.db.entity.Book;
import com.smallfe.bookstore.service.DataService;
import com.smallfe.bookstore.service.DataServiceImpl;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import javax.persistence.PersistenceException;

/**
 *
 * @author mehmetkucukdemir
 */
public class BookForm extends FormLayout {
    
    DataService dataService = new DataServiceImpl();
    
    private TextField title = new TextField("Title");
    private TextField author = new TextField("Author");
    private TextField isbn = new TextField("ISBN");
    private BookTypeSelect type = new BookTypeSelect("Type");
    private BookPublishDateField publishDate = new BookPublishDateField("Publish Date");
    private final Button save = new Button("Save");
    private final Button clear = new Button("Clear");

    public BookForm() {
        setSizeUndefined();
        HorizontalLayout buttons = new HorizontalLayout(save, clear);
        addComponents(title, author, isbn, type, publishDate,buttons);
        
        save.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {save();}
        });
        
        clear.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {clearForm();}
        });
    }
    
    private void clearForm() {
        title.setValue("");
        author.setValue("");
        isbn.setValue("");
        type.setValue(null);
        publishDate.setValue(null);
    }

    private void save() {
        Book book = new Book(
                title.getValue(),
                author.getValue(),
                isbn.getValue(),
                (String) type.getValue(),
                publishDate.getValue()
        );
        try {
            dataService.save(book);
            clearForm();
            Notification.show("Operation has been successfully completed!",Notification.Type.WARNING_MESSAGE);
        } catch (PersistenceException pex){
            Notification.show("Persistence Exception!",Notification.Type.WARNING_MESSAGE);
        } catch (Exception e) {
            Notification.show("Unknown Exception!",Notification.Type.WARNING_MESSAGE);
        }
    }
}
