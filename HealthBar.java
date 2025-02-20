import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HealthBar extends Actor {
    private int health;
    
    public HealthBar(int health) {
        this.health = health;
        updateHealthBar();
    }

    public void updateHealth(int newHealth) {
        this.health = newHealth;
        updateHealthBar();
    }

    private void updateHealthBar() {
        setImage(new GreenfootImage("Health: " + health, 24, Color.WHITE, Color.BLACK));
    }
}
