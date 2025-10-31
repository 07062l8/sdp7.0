// Test
public class GameEventSystem {
    public static void main(String[] args) {
        Player player = new Player();

        // Add observers
        player.addObserver(new GameUI());
        player.addObserver(new GameLogger());
        player.addObserver(new EnemyAI());
        player.addObserver(new AchievementSystem());

        // Event simulation
        player.takeDamage(30);
        player.gainExperience(50);
        player.gainExperience(60); // should call LevelUp
        player.takeDamage(80);
    }
}