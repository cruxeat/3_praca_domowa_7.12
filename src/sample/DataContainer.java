package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataContainer {

    private ObservableList<Czlowieczek> czlowieczeks;

    public ObservableList<Czlowieczek> getCzlowieczeks() {
        return czlowieczeks;
    }

    public void setCzlowieczeks(ObservableList<Czlowieczek> czlowieczeks) {
        this.czlowieczeks = FXCollections.observableArrayList(czlowieczeks);

    }

    public DataContainer (){
        czlowieczeks = FXCollections.observableArrayList();
    }
}
