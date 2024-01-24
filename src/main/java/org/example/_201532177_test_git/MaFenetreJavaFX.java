package org.example._201532177_test_git;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MaFenetreJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ma Fenêtre JavaFX");

        Button bouton = new Button("Cliquez-moi !");
        bouton.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        StackPane layout = new StackPane();
        layout.getChildren().add(bouton);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

