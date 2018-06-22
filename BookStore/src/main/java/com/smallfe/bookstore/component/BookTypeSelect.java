/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallfe.bookstore.component;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.NativeSelect;

/**
 *
 * @author mehmetkucukdemir
 */
public class BookTypeSelect extends NativeSelect {

    public BookTypeSelect(String caption) {
        super(caption);
        super.addItem("Romance");
        super.addItem("Mystery");
        super.addItem("Horror");
        super.addItem("Self help");
        super.addItem("Health");
        super.addItem("Religion");
    }
    
}
