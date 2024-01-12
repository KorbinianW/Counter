package com.example.counter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Counter {
    @FXML
    private Button Add;

    @FXML
    private TextArea Display;
    @FXML
    private Button Decrease;

    @FXML
    private Button Reset;


    int number = 0;
    @FXML
    protected void onAddButtonClick() {
        Display.setText(String.valueOf(number = number + 1));
    }

    @FXML
    protected void onDecreaseButtonClick() {
        Display.setText(String.valueOf(number = number - 1));
    }

    @FXML
    protected void onResetButtonClick() {
        Display.setText(String.valueOf(number = 0));
    }
}