package sample;

public class Contr_Stat implements HierarchicalController<Controller> {
    private Controller parentController;

    public void setParentController(Controller parentController) {
        this.parentController = parentController;
    }

    public Controller getParentController() {
        return parentController;
    }
}
