package at.htld.modules.main;

import at.htld.modules.entity.User;
import at.htld.modules.handler.DBHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {

    Scene loginScene, launcherScene, registerScene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        setUserAgentStylesheet(STYLESHEET_MODENA);

        Parent loginRoot = FXMLLoader.load(getClass().getResource("../../fx/login.fxml"));
        Parent laucherRoot = FXMLLoader.load(getClass().getResource("../../fx/launcher.fxml"));
        Parent registerRoot = FXMLLoader.load(getClass().getResource("../../fx/register.fxml"));
        primaryStage.setTitle("Wiki Game");

        loginScene = new Scene(loginRoot, 500,500);
        launcherScene = new Scene(laucherRoot,1280,720);
        registerScene = new Scene(registerRoot, 400, 500);


        primaryStage.setScene(launcherScene);
        primaryStage.show();
    }
    

    public static void main(String[] args) {
       /*
        User u = new User();
        u.setName("Husein");
        u.setUserName("HUSEINJUSIC");
        u.setPassword("$31$16$UG_DBP_Bvlz5pGrQQfAO11x85mT8bBA3Cx420B8tw6c");

        DBHandler handler = new DBHandler();
        handler.saveUser(u);
        */
        launch(args);
    }
}
