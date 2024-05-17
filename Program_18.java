/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class Data_Ranger extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
        Text text = new Text(20, 20, "Use arrow keys to move the circle");
        Group root = new Group(text, circle);
        Scene scene = new Scene(root, 400, 200);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 50);
                    break;
                case UP:
                    circle.setCenterY(circle.getCenterY() - 50);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 50);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 50);
                    break;
            }
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("Move Circle Using Arrow Keys");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}