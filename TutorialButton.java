import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialButton extends Actor
{
    public TutorialButton() {
        setImage(new GreenfootImage("Tutorial", 40, Color.WHITE, new Color(0, 0, 0, 150)));
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Tutorial()); // Pindah ke game utama
        }
    }
}
