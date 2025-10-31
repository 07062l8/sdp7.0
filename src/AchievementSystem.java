// Concrete observers
public class AchievementSystem implements Observer {
    @Override
    public void update(String eventType, String data) {
        if (eventType.equals("LEVEL_UP")) {
            System.out.println("[ACHIEVEMENT] Congratulations! You've earned the achievement: New Level!");
        }
        if (eventType.equals("XP_GAINED")) {
            System.out.println("[ACHIEVEMENT] The player is gaining experience. Keep up the good work!");
        }
    }
}