import java.util.ArrayList;
import java.util.List;

// Concrete subject - Player
public class Player implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int health = 100;
    private int experience = 0;
    private int level = 1;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String eventType, String data) {
        for (Observer o : observers) {
            o.update(eventType, data);
        }
    }

    // Methods for changing the player's state
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        notifyObservers("HEALTH_CHANGED", "Player health: " + health);
    }

    public void gainExperience(int xp) {
        experience += xp;
        notifyObservers("XP_GAINED", "Player experience: " + experience);

        // Check for level increase
        if (experience >= level * 100) {
            level++;
            experience = 0; // сброс опыта для простоты
            notifyObservers("LEVEL_UP", "The player has reached the level " + level);
        }
    }
}