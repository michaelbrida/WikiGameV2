package at.htld.modules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField usern;
    @FXML
    PasswordField pswd;

    @FXML
    protected void buttonPressed(){
        System.out.println(usern.getText() + " " + pswd.getText());
    }
}
