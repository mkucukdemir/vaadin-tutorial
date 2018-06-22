/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author mehmetkucukdemir
 */
public class HomeView extends VerticalLayout implements View {
    
    public static final String VIEW_NAME = "Home";

    public HomeView() {
        BookForm bookForm = new BookForm();
        addComponent(bookForm);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
    
}
