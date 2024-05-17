/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class Data_Ranger extends Application {
    public Text text = new Text(100, 100, "JavaFX is wonderful Programing language");

    @Override
    public void start(Stage primaryStage) {
        HBox hBox_LRbuttons = new HBox(20);
        Button left = new Button("Left");
        Button right = new Button("Right");
        hBox_LRbuttons.getChildren().addAll(left, right);
        HBox hBox_ColorRadioButtons = new HBox(20);
        RadioButton red = new RadioButton("RED");
        RadioButton blue = new RadioButton("BLUE");
        RadioButton green = new RadioButton("GREEN");
        hBox_ColorRadioButtons.getChildren().addAll(red, blue, green);
        ToggleGroup group = new ToggleGroup();
        red.setToggleGroup(group);
        blue.setToggleGroup(group);
        green.setToggleGroup(group);
        Pane Pane_Message = new Pane();
        Pane_Message.getChildren().add(text);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(Pane_Message);
        borderPane.setTop(hBox_ColorRadioButtons);
        borderPane.setBottom(hBox_LRbuttons);
        left.setOnAction(e -> text.setX(text.getX() - 10));
        right.setOnAction(e -> text.setX(text.getX() + 10));
        red.setOnAction(e -> {
            if (red.isSelected()) {
                text.setFill(Color.RED);
            }
        });
        blue.setOnAction(e -> {
            if (blue.isSelected()) {
                text.setFill(Color.BLUE);
            }
        });
        green.setOnAction(e -> {
            if (green.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });
        Scene scene = new Scene(borderPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Arrow Button and Color Radio Button Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}