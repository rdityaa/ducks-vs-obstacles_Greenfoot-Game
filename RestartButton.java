import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class RestartButton extends Actor {
    public RestartButton() {
        // Membuat tombol restart dengan teks besar dan transparan
        GreenfootImage buttonImage = new GreenfootImage("Restart", 40, Color.WHITE, new Color(0, 0, 0, 150));
        setImage(buttonImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1()); // Pastikan nama world default MyWorld
        }
    }
}

