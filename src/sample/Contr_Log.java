package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Contr_Log implements HierarchicalController<Controller>{
    private Controller parentController;
    public Pane srodekLog;
    public TextField user;
    public TextField password;



    @Override
    public void setParentController(Controller parentController) {
        this.parentController = parentController;

    }

    @Override
    public Controller getParentController() {
        return parentController;
    }


    public void zaloguj(ActionEvent actionEvent) {
        if (user.getText().equals("Baton")&& password.getText().equals("baton")) {

            parentController.login.setText(user.getText());
            parentController.rola.setText("Użytkownik");
            parentController.ToWylog(actionEvent);

        }

        else if (user.getText().equals("Admin")&& password.getText().equals("admin")) {

            parentController.login.setText(user.getText());
            parentController.rola.setText("Administrator");
            parentController.ToWylog(actionEvent);

        }

        else {
            user.setText("Zle haslo");
        }



    }


}

