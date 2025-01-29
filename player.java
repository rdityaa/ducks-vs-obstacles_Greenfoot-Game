import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class player extends Actor
{
    private GreenfootSound soundTembak = new GreenfootSound("piw.mp3");
    int vSpeed = 0;
    int accel = 0;
    int speed = 5;
    int health = 3;
    boolean kenaMusuh;
    public void act()
    {
        checkFalling();
        fall();
        control();
        landing();
        nembak();
        Mati();
    }
    
    public void nembak()
    {
        if(Greenfoot.mouseClicked(null))
        {
            soundTembak.stop();
            getWorld().addObject(new pelor(), getX(), getY());
            soundTembak.play();
        }
    }
    
    public void fall()
    {   
        setLocation(getX(), getY() + vSpeed);
    }
    
    public void landing()
    {
        if(isTouching(lantai.class))
        {
            setLocation(getX(), getY() - 1);     
        }
    }
    
    public void checkFalling()
    {
        if(!isTouching(lantai.class))
        {
            vSpeed++;
        }
        else
            vSpeed = -5;
    }
    
    public void control()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }   
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("space"))
        {
            vSpeed = -12;
        }
    }
    
   public void Mati() {
    // Cek apakah pemain menyentuh musuh, paku, atau pakuatas
    if (isTouching(musuh.class) && !kenaMusuh) {
        health--; // Kurangi health saat terkena musuh
        kenaMusuh = true; // Tandai bahwa pemain telah terkena musuh
    } else if (isTouching(paku.class) || isTouching(pakuatas.class)) {
        // Jika terkena paku atau pakuatas, langsung hapus player
        getWorld().removeObject(this); // Hapus player jika mati
        return; // Hentikan eksekusi lebih lanjut karena karakter sudah mati
    } else if (!isTouching(musuh.class) && !isTouching(paku.class) && !isTouching(pakuatas.class)) {
        kenaMusuh = false; // Reset jika tidak lagi menyentuh musuh, paku, atau pakuatas
    }

    // Jika health <= 0, hapus objek pemain
    if (health <= 0) {
        getWorld().removeObject(this); // Hapus player jika mati
    }
}


}
