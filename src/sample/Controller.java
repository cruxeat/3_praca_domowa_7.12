package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.List;

public class Controller implements HierarchicalController<Controller>  {


    public Pane srodek;
    public TextField login;
    public TextField rola;
    protected DataContainer dataContainer;
    public List<Integer> lista_statystyk;



    public String getSredniWiek(){
        return Integer.toString(lista_statystyk.get(0));
    }
    public String getSredniWzrost(){
        return Integer.toString(lista_statystyk.get(1));
    }
    public String getLiczba(){
        return Integer.toString(lista_statystyk.get(2));
    }

    public DataContainer getDataContainer() {
        return dataContainer;
    }

    public Controller() {
        dataContainer =  new DataContainer();
    }

    private void loadIntoPane(String fxml) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        try {
            final Pane load = loader.load();
            srodek.getChildren().clear();
            srodek.getChildren().add(load);
            HierarchicalController<Controller> daneController = loader.getController();
            daneController.setParentController(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void ToLogowanie(ActionEvent actionEvent) {
        if (login.getText().isEmpty()) {
            loadIntoPane("okienko_logowanie.fxml");
        } else {
            loadIntoPane("okienko_wylogowanie.fxml");
        }
    }

    public void ToDane(ActionEvent actionEvent) {
        if (rola.getText().equals("Administrator")){
            loadIntoPane("okienko_dane2.fxml");
        }
        else {
            loadIntoPane("okienko_dane.fxml");
        }
    }

    public void ToStatystyki(ActionEvent actionEvent) {
        loadIntoPane("okienko_statystyka.fxml");
    }

    public void ToWylog(ActionEvent actionEvent) {
        loadIntoPane("okienko_wylogowanie.fxml");
    }



    @Override
    public Controller getParentController() {
        return this;
    }

    @Override
    public void setParentController(Controller parent) {

    }
}
