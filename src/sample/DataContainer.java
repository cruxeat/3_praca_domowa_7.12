package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class DataContainer {

    private ObservableList<Czlowieczek> czlowieczeks ;
    ObservableList<Czlowieczek> czlowieczek1, czlowieczek2, czlowieczek3;

    public ObservableList<Czlowieczek> getCzlowieczeks() {
        czlowieczeks.add(new Czlowieczek ("Agnieszka", "Kulesza", "1", "2", "3"));
        czlowieczeks.add(new Czlowieczek ("Nika", "Sidorowidz", "1", "2", "3"));
        czlowieczeks.add(new Czlowieczek ("Kasia", "Rode", "1", "2", "3"));

        return czlowieczeks;
    }

    public void setCzlowieczeks(List<Czlowieczek> czlowieczeks) {
        this.czlowieczeks = FXCollections.observableArrayList(czlowieczeks);

    }

    public DataContainer (){
        czlowieczeks = FXCollections.observableArrayList();
    }


}
