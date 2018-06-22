package com.smallfe.bookstore;

import com.smallfe.bookstore.view.HomeView;
import com.smallfe.bookstore.view.AboutView;
import com.smallfe.bookstore.view.DefaultView;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * The BookStore's "main" class
 */
@SuppressWarnings("serial")
@Theme("custom")
public class MyVaadinUI extends UI
{

    @Override
    protected void init(VaadinRequest request) {
        Page.getCurrent().setTitle("Bookstore");
        Label title = new Label();        
        
        Button home = new Button("Home", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                getNavigator().navigateTo("home");
            }
        });
        Button about = new Button("About", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                getNavigator().navigateTo("about");
            }
        });
        
        VerticalLayout menu = new VerticalLayout(title,home,about);
        menu.setStyleName("v-menu");
        menu.setSpacing(true);
        menu.setMargin(true);
        
        VerticalLayout viewContainer = new VerticalLayout();
        viewContainer.setMargin(true);
        
        HorizontalLayout mainLayout = new HorizontalLayout(menu,viewContainer);
        mainLayout.setSizeFull();
        mainLayout.setExpandRatio(menu, 1);
        mainLayout.setExpandRatio(viewContainer, 9);
        setContent(mainLayout);
        
        Navigator navigator = new Navigator(this, viewContainer);
        
        navigator.addView("", new DefaultView());
        navigator.addView("home", new HomeView());
        navigator.addView("about", new AboutView());
    }

}
