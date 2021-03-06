package kotlintry;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        KotlinMain kotlin = new KotlinMain();
        GridPane root =new GridPane();
        primaryStage.setTitle("Kotlin?");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Button button = new Button();
        button.setOnAction(e -> {
            kotlin.start();
        });
        root.getChildren().add(button);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
