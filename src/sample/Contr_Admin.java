package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Contr_Admin {
    private Contr_Dane parentController;
    public TableView<Czlowieczek> table;
    public TextField imie;
    public TextField nazwisko;
    public TextField pesel;
    public TextField wiek;
    public TextField wzrost;




    public void handleClick(ActionEvent actionEvent) {
        table.getItems().add(new Czlowieczek(imie.getText(), nazwisko.getText(), pesel.getText(), wiek.getText(), wzrost.getText() ));
        imie.clear();
        nazwisko.clear();
        pesel.clear();
        wiek.clear();
        wzrost.clear();
        table.getItems().addAll(parentController.getDataContainer().getCzlowieczeks());
        // tu bym chciała żeby on się odwoływał do tego samego dataconteinera, ale nie wiem jak się odwołać do "dziadka"
    }

    public void handleClick2(ActionEvent actionEvent) {
    }

    public Contr_Dane getParentController() {
        return parentController;
    }

    public void setParentController(Contr_Dane parentController) {
        this.parentController = parentController;
    }
}
