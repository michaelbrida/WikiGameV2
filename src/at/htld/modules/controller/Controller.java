package at.htld.modules.controller;

import at.htld.util.PasswordAuthentication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;


import java.io.IOException;


public class Controller {

    @FXML
    TextField usern;
    @FXML
    PasswordField pswd;

    @FXML
    Button lgnbtn;

    @FXML
    protected void loginPressed() throws IOException {
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication();
        String hash = passwordAuthentication.hash(pswd.getText());
        System.out.println(hash);

        if(passwordAuthentication.authenticate(pswd.getText(),"$31$16$webxL-84MGkVX-PQnm4TMBL1KXh0W_rjNKajxVH6MAs")){
            System.out.println("RICHTIG");
        }
        else{
            System.out.println("falsch");
        }
    }

}
