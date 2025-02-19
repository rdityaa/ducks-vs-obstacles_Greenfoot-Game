import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends World
{
    public Level1()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Joystick joystick = new Joystick();
        addObject(joystick, 100, 500);
        player player = new player(joystick);
        addObject(player, 28, 517);
        dirt dirt = new dirt(1000, 60);
        addObject(dirt, 499, 568);
        paku paku = new paku();
        addObject(paku, 61, 429);
        platform platform = new platform(300, 20);
        addObject(platform, 127, 391);
        pakuatas pakuatas = new pakuatas();
        addObject(pakuatas, 270, 508);
        pakuatas pakuatas2 = new pakuatas();
        addObject(pakuatas2, 398, 508);
        musuh musuh = new musuh();
        addObject(musuh, 260, 359);
        platform platform2 = new platform(300, 20);
        addObject(platform2, 404, 276);
        platform platform3 = new platform(300, 20);
        addObject(platform3, 550, 387);
        musuh musuh2 = new musuh();
        addObject(musuh2, 684, 354);
        musuh musuh3 = new musuh();
        addObject(musuh3, 537, 247);
        platform platform4 = new platform(300, 20);
        addObject(platform4, 125, 160);
        paku paku2 = new paku();
        addObject(paku2, 65, 199);
        pintu pintu = new pintu();
        addObject(pintu, 963, 485);
        pakuatas pakuatas3 = new pakuatas();
        addObject(pakuatas3, 669, 504);
        platform platform5 = new platform(300, 20);
        addObject(platform5, 896, 276);
    }
}
