import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dirt dirt = new dirt(1000, 60);
        addObject(dirt,499,568);
        player player = new player();
        addObject(player,28,517);
        paku paku = new paku();
        addObject(paku,61,429);
        platform platform = new platform(300, 20);
        addObject(platform,127,391);
        pakuatas pakuatas = new pakuatas();
        addObject(pakuatas,272,503);
        pakuatas.setLocation(270,508);
        pakuatas pakuatas2 = new pakuatas();
        addObject(pakuatas2,398,508);
        musuh musuh = new musuh();
        addObject(musuh,260,359);
        platform platform2 = new platform(300, 20);
        addObject(platform2,404,276);
        platform platform3 = new platform(300, 20);
        addObject(platform3,550,387);
        musuh musuh2 = new musuh();
        addObject(musuh2,684,354);
        musuh musuh3 = new musuh();
        addObject(musuh3,537,247);
        platform platform4 = new platform(300, 20);
        addObject(platform4,130,163);
        platform4.setLocation(156,163);
        platform4.setLocation(120,168);
        platform4.setLocation(120,168);
        platform4.setLocation(124,173);
        platform4.setLocation(125,160);
        platform.setLocation(205,384);
        paku paku2 = new paku();
        addObject(paku2,65,199);
        door door = new door();
        addObject(door,952,486);
        pakuatas pakuatas3 = new pakuatas();
        addObject(pakuatas3,669,504);
        platform platform5 = new platform(300, 20);
        addObject(platform5,849,273);
        platform5.setLocation(896,276);
        musuh musuh4 = new musuh();
        addObject(musuh4,975,242);
        musuh.setLocation(261,352);
        removeObject(musuh);
        musuh3.setLocation(536,227);
        removeObject(musuh3);
        musuh2.setLocation(674,339);
        removeObject(musuh2);
        musuh4.setLocation(970,241);
        removeObject(musuh4);
        platform2.setLocation(502,281);
        platform3.setLocation(730,389);
        platform3.setLocation(726,387);
        platform2.setLocation(490,280);
        door.setLocation(944,506);
        door.setLocation(907,469);
        removeObject(door);
        pintu pintu = new pintu();
        addObject(pintu,963,485);
        dirt.setLocation(482,253);
        dirt.setLocation(682,578);
        dirt.setLocation(487,552);
        dirt.setLocation(490,553);
        dirt.setLocation(169,572);
        dirt.setLocation(782,570);
        dirt.setLocation(387,567);
        player.setLocation(524,221);
        dirt.setLocation(502,561);
        dirt.setLocation(542,577);
        dirt.setLocation(515,553);
        dirt.setLocation(581,577);
        dirt.setLocation(526,585);
        dirt.setLocation(547,565);
        dirt.setLocation(429,565);
        player.setLocation(33,507);
        dirt.setLocation(282,579);
        removeObject(dirt);
        dirt = new dirt(1000, 60);
        addObject(dirt,499,567);
    }
}
