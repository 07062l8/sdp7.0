// Concrete observers
public class GameUI implements Observer {
    @Override
    public void update(String eventType, String data) {
        System.out.println("[UI] Interface update -> " + data);
    }
}