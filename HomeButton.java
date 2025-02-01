import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeButton extends Actor
{
    public HomeButton() {
        // Membuat tombol restart dengan teks besar dan transparan
        GreenfootImage buttonImage = new GreenfootImage("Kembali ke Home", 40, Color.WHITE, new Color(0, 0, 0, 150));
        setImage(buttonImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HomeScreen()); // Pastikan nama world default MyWorld
        }
    }
}
