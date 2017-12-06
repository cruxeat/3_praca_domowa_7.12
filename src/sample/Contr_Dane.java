package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class Contr_Dane implements HierarchicalController<Controller>{
    private Controller parentController;
    public TableView<Czlowieczek> table;

    public Controller getParentController() {
        return parentController;
    }

    public void setParentController(Controller parentController) {
        this.parentController = parentController;
        table.getItems().addAll(parentController.getDataContainer().getCzlowieczeks());
    }

    public void wyliczStat(ActionEvent actionEvent) {
        Integer sr_wzrost;
        Integer sr_wiek;
        Integer liczba;



        parentController.ToStatystyki(actionEvent);
    }

    public void initialize() {

        for (TableColumn<Czlowieczek, ?> column : table.getColumns()) {
            if ("kol_imie".equals(column.getId())) {
                //TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                column.setCellValueFactory(new PropertyValueFactory<>("imie"));
            } else if ("kol_nazwisko".equals(column.getId())) {
                //TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                column.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
            }
            else if ("kol_pesel".equals(column.getId())) {
                //TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                column.setCellValueFactory(new PropertyValueFactory<>("pesel"));
            }
            else if ("kol_wiek".equals(column.getId())) {
                //TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                column.setCellValueFactory(new PropertyValueFactory<>("wiek"));
            }
            else if ("kol_wzrost".equals(column.getId())) {
                //TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                column.setCellValueFactory(new PropertyValueFactory<>("wzrost"));
            }
        }
    }


    ///public void synchronizuj(ActionEvent actionEvent) {
       /// parentController.getDataContainer().setCzlowieczeks(table.getItems());}
}