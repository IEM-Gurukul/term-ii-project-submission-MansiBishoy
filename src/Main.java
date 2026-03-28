import view.EventView;
import controller.EventController;


public class Main {
    public static void main(String[] args) {
        EventView view = new EventView();
        new EventController(view);
    }
}
