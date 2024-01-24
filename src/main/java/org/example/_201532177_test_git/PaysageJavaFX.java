package org.example._201532177_test_git;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaysageJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Paysage JavaFX");

        // Ciel bleu
        Rectangle ciel = new Rectangle(800, 600, Color.SKYBLUE);

        // Gazon vert
        Rectangle gazon = new Rectangle(800, 200, Color.LIMEGREEN);
        gazon.setY(400);  // Positionne le gazon en bas de la fenêtre

        // Soleil jaune
        Circle soleil = new Circle(50, Color.YELLOW);
        soleil.setCenterX(100);
        soleil.setCenterY(100);

        // Dromadaire
        Group dromadaire = createDromedary(400, 350, Color.BROWN);

        // Lac
        Rectangle lac = new Rectangle(800, 100, Color.BLUE);
        lac.setY(300); // Positionne le lac au milieu de la fenêtre

        // Bateau
        Rectangle bateau = new Rectangle(200, 320, 50, 20);
        bateau.setFill(Color.BROWN);

        Group root = new Group(ciel, gazon, soleil, dromadaire, lac, bateau);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Group createDromedary(double x, double y, Color color) {
        Group group = new Group();

        // Corps
        Rectangle body = new Rectangle(x, y, 80, 40);
        body.setFill(color);

        // Tête
        Circle head = new Circle(x + 80, y + 20, 20);
        head.setFill(color);

        // Pattes
        Rectangle leg1 = new Rectangle(x + 20, y + 40, 10, 30);
        Rectangle leg2 = new Rectangle(x + 50, y + 40, 10, 30);

        // Queue
        Polygon tail = new Polygon(x, y + 20, x - 10, y + 20, x - 10, y + 40, x, y + 40);
        tail.setFill(color);

        // Bosse sur le dos
        Circle hump = new Circle(x + 40, y - 10, 15);
        hump.setFill(color);

        // Ajouter la tête, les pattes, la queue et la bosse au groupe
        group.getChildren().addAll(body, head, leg1, leg2, tail, hump);

        return group;
    }
}
