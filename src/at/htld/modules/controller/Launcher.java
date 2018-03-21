package at.htld.modules.controller;

import at.htld.modules.handler.Session;
import javafx.fxml.FXML;
import javafx.scene.text.Text;



public class Launcher {

    private Session session;

    @FXML
    private Text userNameLabel;


    @FXML
    protected void initialize(){
        userNameLabel.setText("LOL JEBOTE");
    }


    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

}
