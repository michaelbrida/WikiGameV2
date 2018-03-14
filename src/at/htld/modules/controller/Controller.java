package at.htld.modules.controller;

import at.htld.modules.entity.User;
import at.htld.modules.handler.DBHandler;
import at.htld.util.PasswordAuthentication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;


public class Controller {

    private DBHandler dbHandler = new DBHandler();
    private User u;
    private PasswordAuthentication pA;

    @FXML
    TextField usern;
    @FXML
    PasswordField pswd;

    @FXML
    Button lgnbtn;

    @FXML
    protected void loginPressed() throws IOException {
       /*
        try {
            u = dbHandler.getUserByUserName(usern.getText());
            pA = new PasswordAuthentication();


            if(pA.authenticate(pswd.getText().toCharArray(),u.getPassword())){
                System.out.println("RICHTIG");
            }
            else{
                System.out.println("falsch");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }

    @FXML
    protected void registerPressed(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("../../fx/register.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        }
    }

}
