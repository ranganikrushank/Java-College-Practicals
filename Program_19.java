/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class circle_color extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, 100, 200);
        circle.setStroke(Color.BLACK);
        HBox root = new HBox(circle);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        root.setOnMousePressed(E -> circle.setFill(Color.RED));
        root.setOnMouseReleased(E -> circle.setFill(Color.BLUE));
        primaryStage.setTitle("Circle Color Demo");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}