package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static final int width = 1200;
    private static final int height = 600;
    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Ionic Cordova 快捷工具");
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.setResizable(false);
        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            try {
                stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }
}