// Concrete observers
public class GameLogger implements Observer {
    @Override
    public void update(String eventType, String data) {
        System.out.println("[LOG] Event: " + eventType + " | " + data);
    }
}