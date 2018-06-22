/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.view;

import com.smallfe.bookstore.db.entity.Book;
import com.smallfe.bookstore.service.DataService;
import com.smallfe.bookstore.service.DataServiceImpl;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

/**
 *
 * @author mehmetkucukdemir
 */
public class BookForm extends FormLayout {
    
    DataService dataService = new DataServiceImpl();
    
    private TextField title = new TextField("Title");
    private TextField author = new TextField("Author");
    private TextField isbn = new TextField("ISBN");
    private NativeSelect type = new NativeSelect("Type");
    private PopupDateField publishDate = new PopupDateField("Publish Date");
    private final Button save = new Button("Save");
    private final Button delete = new Button("Delete");

    public BookForm() {
        type.addItem("Romance");
        type.addItem("Mystery");
        type.addItem("Horror");
        type.addItem("Self help");
        type.addItem("Health");
        type.addItem("Religion");        
        
        setSizeUndefined();
        HorizontalLayout buttons = new HorizontalLayout(save, delete);
        addComponents(title, author, isbn, type, publishDate,buttons);
        
        save.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                save();
            }

            private void clearForm() {
                title.setValue(null);
                author.setValue(null);
                isbn.setValue(null);
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
                    Notification.show("Operation has been successfully completed!");
                } catch (Exception e) {
                    Notification.show("An error has been occured!");
                }
            }

        });
    }
    
}
