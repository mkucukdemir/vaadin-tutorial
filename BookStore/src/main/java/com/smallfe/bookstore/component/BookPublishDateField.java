/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.component;

import com.vaadin.ui.PopupDateField;

/**
 *
 * @author mehmetkucukdemir
 */
public class BookPublishDateField extends PopupDateField {

    public BookPublishDateField(String caption) {
        super(caption);
        super.setDateFormat("dd-MM-yyyy");
    }
    
}
