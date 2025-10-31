// Concrete observers
public class EnemyAI implements Observer {
    @Override
    public void update(String eventType, String data) {
        if (eventType.equals("HEALTH_CHANGED")) {
            System.out.println("[AI] Enemy reacts: Player is weakened!");
        }
    }
}