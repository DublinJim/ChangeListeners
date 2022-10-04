package com.example.changelisteners;

import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Slider slider1 = new Slider(0, 100, 14);

    public Text txt1;
    public AnchorPane root;
    public Font fontSize;
    public Text txt2Instr;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setSlider();
        txt2Instr.setFill(Paint.valueOf("#1f682b"));
        root.getChildren().add(slider1);
        slider1.valueProperty().addListener((observableValue, number, t1) -> {

            System.out.println("slider changed " + slider1.getValue());
            fontSize = Font.font(slider1.getValue());
            txt1.setFont(fontSize);

        });
    }

    private void setSlider() {
        slider1.setBlockIncrement(10);
        slider1.setShowTickMarks(false);
        slider1.setShowTickLabels(true);
        slider1.setMajorTickUnit(0.25);
        slider1.setBlockIncrement(0.10);
        slider1.setLayoutX(170.0);
        slider1.setLayoutY(309.0);
        slider1.setPrefHeight(14.00);
        slider1.setPrefWidth(300.0);
        slider1.setBorder(Border.stroke(Paint.valueOf("red")));

    }
}
