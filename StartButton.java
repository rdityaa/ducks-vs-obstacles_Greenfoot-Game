import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor {
    public StartButton() {
        setImage(new GreenfootImage("Start", 40, Color.WHITE, new Color(0, 0, 0, 150)));
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1()); // Pindah ke game utama
        }
    }
}