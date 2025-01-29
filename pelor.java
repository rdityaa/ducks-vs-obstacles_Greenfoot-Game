import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pelor extends Actor
{
    private int speed = 10; // Kecepatan peluru
    private boolean launched = false; // Status apakah peluru sudah diluncurkan

    public void act()
    {
        if (!launched) {
            arahMouse(); // Arahkan ke posisi mouse hanya sekali sebelum diluncurkan
            launched = true; // Tandai peluru sudah diluncurkan
        }
        move(speed); // Gerakkan peluru maju
        checkPelor(); // Periksa apakah peluru keluar layar
    }

    public void arahMouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo(); // Dapatkan posisi mouse
        if (mouse != null) { // Periksa apakah mouse tidak null
            turnTowards(mouse.getX(), mouse.getY()); // Arahkan peluru ke arah mouse
        }
    }

    public void checkPelor()
    {
        World world = getWorld();
        if (getX() <= 0 || getX() >= world.getWidth() - 1 || getY() <= 0 || getY() >= world.getHeight() - 1) {
            world.removeObject(this); // Hapus peluru jika keluar layar
        }
    }
}
