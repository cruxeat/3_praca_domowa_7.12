package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {

    public Pane srodek;


    public void ToLogowanie(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("okienko_logowanie.fxml"));
        try{
            Parent pane = loader.load();
            Contr_Log controller = loader.getController();
            controller.setParentController(this);
            srodek.getChildren().clear();
            srodek.getChildren().add(pane);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ToDane(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("okienko_dane"));
        try {
            Parent pane = loader.load();
            Contr_Dane controller = loader.getController();
            controller.setParentController(this);
            srodek.getChildren().clear();
            srodek.getChildren().add(pane);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ToStatystyki(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("okienko_statystyka"));
        try {
            Parent pane = loader.load();
            Contr_Stat controller = loader.getController();
            controller.setParentController(this);
            srodek.getChildren().clear();
            srodek.getChildren().add(pane);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
