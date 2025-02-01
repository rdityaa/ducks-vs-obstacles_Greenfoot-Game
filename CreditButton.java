import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditButton extends Actor
{
    public CreditButton() {
        // Membuat tombol restart dengan teks besar dan transparan
        GreenfootImage buttonImage = new GreenfootImage("Credit", 40, Color.WHITE, new Color(0, 0, 0, 150));
        setImage(buttonImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Credit()); // Pastikan nama world default MyWorld
        }
    }
}
