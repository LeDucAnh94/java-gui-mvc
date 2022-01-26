package com.company;

import java.awt.event.ActionEvent;

public class Controller {
    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addButtonActionListener((ActionEvent e) -> {
            view.setLabelText(view.getText());
        });
    }
}
