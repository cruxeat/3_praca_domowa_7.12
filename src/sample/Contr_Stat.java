package sample;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;

public class Contr_Stat implements HierarchicalController<Controller> {
    private Controller parentController;
    public TableView<String> table;

    public void setParentController(Controller parentController) {
        if(parentController == null){
            throw new RuntimeException("nie ma kontrolera w setparent");
        }
        this.parentController = parentController;
    }

    public Controller getParentController() {
        return parentController;
    }

//    public void initialize() {
//        if(parentController == null){
//            throw new RuntimeException("nie ma kontrolera w initialize");
//        }
//
//        for (TableColumn<String, ?> column : table.getColumns()) {
//            if ("sr_wiek".equals(column.getId())) {
//
//                column.setText(parentController.getSredniWiek());
//            } else if ("sr_wzrost".equals(column.getId())) {
//                column.setText(parentController.getSredniWzrost());
//            } else if ("liczba".equals(column.getId())) {
//                column.setText(parentController.getLiczba());
//            }
//        }
//    }
}
