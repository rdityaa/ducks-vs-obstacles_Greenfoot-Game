    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class GameOver here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class GameOver extends World {
    public GameOver() {    
        super(1000, 600, 1); // Ukuran layar (lebar 1000, tinggi 600, skala 1)

        // Set background custom
        setBackground(new GreenfootImage("kalah.png"));
        // Tambahkan tombol Restart di bawah teks
        addObject(new RestartButton(), getWidth() / 2, 500);
    }
}