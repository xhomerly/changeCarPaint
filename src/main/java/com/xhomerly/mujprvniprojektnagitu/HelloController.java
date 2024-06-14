package com.xhomerly.mujprvniprojektnagitu;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.shape.Polygon;

public class HelloController {
    @FXML private Polygon auto;
    @FXML private ColorPicker colorPicker;

    private boolean wracked = false;

    public void changeColor() {
        auto.setFill(colorPicker.getValue());
    }
}