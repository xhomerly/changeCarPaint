package com.xhomerly.mujprvniprojektnagitu;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class HelloController {
    @FXML private Polygon auto;
    @FXML private ColorPicker colorPicker;
    @FXML private Slider slider;
    @FXML private Circle frontWheel;
    @FXML private Circle backWheel;

    private boolean wracked = false;

    @FXML
    public void initialize() {
        slider.valueProperty().addListener((obs, oldVal, newVal) -> {
            frontWheel.setRadius(slider.getValue());
            backWheel.setRadius(slider.getValue());
        });
    }

    public void changeColor() {
        auto.setFill(colorPicker.getValue());
    }
}