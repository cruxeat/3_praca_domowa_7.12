package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class Contr_Dane2 implements HierarchicalController<Controller>{
    private Controller parentController;
    public TableView<Czlowieczek> table;
    public TextField imieInput;
    public TextField nazwiskoInput;
    public TextField peselInput;
    public TextField wiekInput;
    public TextField wzrostInput;

    public Controller getParentController() {
        return parentController;
    }

    public void setParentController(Controller parentController) {
        this.parentController = parentController;
        table.getItems().addAll(parentController.getDataContainer().getCzlowieczeks());
    }

    public void wyliczStat(ActionEvent actionEvent) {

        ObservableList<Czlowieczek> czlowieczki = parentController.getDataContainer().getCzlowieczeks();

        int liczba = czlowieczki.size();
        int suma_wzrost = 0;
        int suma_wiek = 0;
        for (Czlowieczek c : czlowieczki) {
            suma_wiek += Integer.parseInt(c.getWiek());
            suma_wzrost += Integer.parseInt(c.getWzrost());
        }

        int sr_wzrost = suma_wzrost / liczba;
        int sr_wiek = suma_wiek / liczba;

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(sr_wiek);
        lista.add(sr_wzrost);
        lista.add(liczba);

        parentController.lista_statystyk = lista;
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

    public void clickAdd(ActionEvent actionEvent) {
        Czlowieczek czlowieczek =  new Czlowieczek();
        czlowieczek.setImie(imieInput.getText());
        czlowieczek.setNazwisko(nazwiskoInput.getText());
        czlowieczek.setPesel(peselInput.getText());
        czlowieczek.setWiek(wiekInput.getText());
        czlowieczek.setWzrost(wzrostInput.getText());

        table.getItems().add(czlowieczek);
        imieInput.clear();
        nazwiskoInput.clear();
        peselInput.clear();
        wiekInput.clear();
        wzrostInput.clear();

    }

    public void clickDelete(ActionEvent actionEvent) {
        ObservableList<Czlowieczek> czlowieczekWybrany, wszystkieCzlowieczki;
        wszystkieCzlowieczki = table.getItems();
        czlowieczekWybrany = table.getSelectionModel().getSelectedItems();
        czlowieczekWybrany.forEach(wszystkieCzlowieczki::remove);
    }


    ///public void synchronizuj(ActionEvent actionEvent) {
       /// parentController.getDataContainer().setCzlowieczeks(table.getItems());}
}