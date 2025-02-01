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
    private GreenfootImage[] idleFrames = new GreenfootImage[2];
    private GreenfootImage[] runFrames = new GreenfootImage[6];
    private GreenfootImage[] jumpFrames = new GreenfootImage[4];
    private int currentFrameIdle = 0; // Untuk animasi idle
    private int currentFrameRun = 0;  // Untuk animasi run
    private int currentFrameJump = 0; // Untuk animasi jump
    private int currentFrameMundur = 0; // Untuk animasi mundur
    private int animationSpeed = 10;
    private int counter = 0;

    public player()
    {
        // Setingan Gambar Idle
        idleFrames[0] = new GreenfootImage("idle_1.png");
        idleFrames[1] = new GreenfootImage("idle_2.png");

        // Setingan Gambar Run
        runFrames[0] = new GreenfootImage("run_1.png");
        runFrames[1] = new GreenfootImage("run_2.png");
        runFrames[2] = new GreenfootImage("run_3.png");
        runFrames[3] = new GreenfootImage("run_4.png");
        runFrames[4] = new GreenfootImage("run_5.png");
        runFrames[5] = new GreenfootImage("run_6.png");

        // Setingan Gambar Jump
        jumpFrames[0] = new GreenfootImage("jump_1.png");
        jumpFrames[1] = new GreenfootImage("jump_2.png");
        jumpFrames[2] = new GreenfootImage("jump_3.png");
        jumpFrames[3] = new GreenfootImage("jump_4.png");

        // Set gambar awal (Idle frame pertama)
        setImage(idleFrames[0]);
    }

    public void act()
    {
        counter++;
        checkFalling();
        fall();
        landing();
        nembak();
        Mati();
        win();
        next();
        animasiIdle();
        animasiRun();
        animasiJump();
        animasiMundur();
    }

    // Animasi Idle yang berjalan terus
    public void animasiIdle()
    {
        if (counter % animationSpeed == 0)  // Ganti gambar setiap beberapa frame
        {
            currentFrameIdle = (currentFrameIdle + 1) % idleFrames.length;  // Ganti gambar setiap interval
            setImage(idleFrames[currentFrameIdle]);
        }
    }

    // Animasi Run
    public void animasiRun()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            if(counter % animationSpeed == 0)
            {
                currentFrameRun = (currentFrameRun + 1) % runFrames.length;
                setImage(runFrames[currentFrameRun]);
            }
            setLocation(getX() + speed, getY());
        }
    }

    // Animasi Mundur
    public void animasiMundur()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            if(counter % animationSpeed == 0)
            {
                currentFrameMundur = (currentFrameMundur + 1) % runFrames.length;
                setImage(runFrames[currentFrameMundur]);
            }
            setLocation(getX() - speed, getY());
        }
    }

    // Animasi Jump
    public void animasiJump()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(counter % animationSpeed == 0)
            {
                currentFrameJump = (currentFrameJump + 1) % jumpFrames.length;
                setImage(jumpFrames[currentFrameJump]);
            }
            vSpeed = -12;
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
            vSpeed = -1;
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

    // Method for health and game over
    public void Mati() {
        // Cek apakah pemain menyentuh musuh, paku, atau pakuatas
        if (isTouching(musuh.class) && !kenaMusuh) {
            health--; // Kurangi health saat terkena musuh
            kenaMusuh = true; // Tandai bahwa pemain telah terkena musuh
        } 

        if (isTouching(paku.class) || isTouching(pakuatas.class)) {
            gameOver();
            return;
        } 

        if (!isTouching(musuh.class) && !isTouching(paku.class) && !isTouching(pakuatas.class)) {
            kenaMusuh = false; // Reset jika tidak lagi menyentuh musuh
        }

        if (health <= 0) {
            gameOver();
        }
    }

    // Game Win
    public void win()
    {   
        if (isTouching(door.class))
        {
            gameWin();
        }
    }
    // Game Over
    private void gameOver() {
        Greenfoot.setWorld(new GameOver()); // Ngubah ke Game Over
        Greenfoot.delay(10); 
    }
    // Next Level
    public void next()
    {   
        if (isTouching(pintu.class))
        {
            Lanjut();
        }
    }

    private void gameWin() {
        Greenfoot.setWorld(new GameWin()); // Buat ngubah ke GameWin
        Greenfoot.delay(10); 
    }

    private void Lanjut() {
        Greenfoot.setWorld(new Level2()); // Buat ngubah ke Level 2
        Greenfoot.delay(10); 
    }
}

