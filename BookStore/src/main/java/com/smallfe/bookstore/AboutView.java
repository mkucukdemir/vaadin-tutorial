/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author mehmetkucukdemir
 */
class AboutView extends VerticalLayout implements View {
    
    public static final String VIEW_NAME="About";

    public AboutView() {
        Label text = new Label("Content of the About view");
        addComponent(text);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
    
}
