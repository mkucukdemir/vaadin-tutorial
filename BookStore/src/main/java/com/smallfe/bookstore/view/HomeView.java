/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.view;

import com.smallfe.bookstore.component.BookTable;
import com.smallfe.bookstore.service.DataService;
import com.smallfe.bookstore.service.DataServiceImpl;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author mehmetkucukdemir
 */
public class HomeView extends VerticalLayout implements View {
    
    DataService dataService = new DataServiceImpl();
    public static final String VIEW_NAME = "Home";

    public HomeView() {
        addComponent(new BookTable(dataService.getAllBooks()));
        addComponent(new BookForm());
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
    
}
