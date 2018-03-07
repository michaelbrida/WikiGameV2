package at.htld.modules.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {

    Scene loginScene, launcherScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent loginRoot = FXMLLoader.load(getClass().getResource("../../fx/login.fxml"));
        Parent laucherRoot = FXMLLoader.load(getClass().getResource("../../fx/launcher.fxml"));
        primaryStage.setTitle("Hello World");

        loginScene = new Scene(loginRoot, 500,500);
        launcherScene = new Scene(laucherRoot,500,500);

        primaryStage.setScene(loginScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
