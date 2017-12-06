package sample;

import javax.swing.text.TableView;

public class Contr_Stat implements HierarchicalController<Controller> {
    private Controller parentController;
    public TableView table;


    public void setParentController(Controller parentController) {
        this.parentController = parentController;
    }

    public Controller getParentController() {
        return parentController;
    }
}


