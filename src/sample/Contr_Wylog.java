package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;

public class Contr_Wylog implements HierarchicalController<Controller> {
    public AnchorPane srodekWylog;
    private Controller parentController;
    //public Controller maincontroller;

    @Override
    public void setParentController(Controller parentController) {
        this.parentController = parentController;

    }
    @Override
    public Controller getParentController() {
        return parentController;
    }

    public void wyloguj(ActionEvent actionEvent) {
        parentController.ToLogowanie(actionEvent);


    }
}