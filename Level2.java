import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private Score score;
    private HealthBar healthBar;
    private player pemain;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        setBackground("background.png");
    }
    
    public void act()
    {
        healthBar.updateHealth(pemain.getHealth());
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Joystick joystick = new Joystick();
        addObject(joystick, 100, 500);
        player player = new player(joystick);
        addObject(player, 50, 517);
        musuh musuh = new musuh();
        addObject(musuh,353,316);
        musuh musuh2 = new musuh();
        addObject(musuh2,232,394);
        musuh musuh3 = new musuh();
        addObject(musuh3,765,387);
        musuh musuh4 = new musuh();
        addObject(musuh4,611,507);
        platform platform = new platform(300, 20);
        addObject(platform,237,422);
        platform platform2 = new platform(300, 20);
        addObject(platform2,461,345);
        platform platform3 = new platform(300, 20);
        addObject(platform3,873,427);
        score = new Score();
        addObject(score,32,26);
        score.setLocation(78,20);
        musuh4.setLocation(583,518);
        platform2.setLocation(459,353);
        platform2.setLocation(447,342);
        platform2.setLocation(483,348);
        musuh.setLocation(604,318);
        platform2.setLocation(566,341);
        musuh.setLocation(511,345);
        platform2.setLocation(479,349);
        musuh.setLocation(596,306);
        musuh.setLocation(602,318);
        musuh.setLocation(620,235);
        platform2.setLocation(577,258);
        platform2.setLocation(509,269);
        platform2.setLocation(605,268);
        platform2.setLocation(507,262);
        platform2.setLocation(574,266);
        platform2.setLocation(511,261);
        musuh.setLocation(601,261);
        musuh.setLocation(506,261);
        platform2.setLocation(569,259);
        musuh.setLocation(686,229);
        musuh.setLocation(693,232);
        platform.setLocation(334,364);
        musuh2.setLocation(179,248);
        platform.setLocation(320,369);
        platform.setLocation(212,381);
        musuh2.setLocation(339,355);
        platform3.setLocation(537,428);
        platform3.setLocation(628,421);
        platform3.setLocation(585,426);
        musuh3.setLocation(713,410);
        musuh3.setLocation(707,397);
        platform platform4 = new platform(300, 20);
        addObject(platform4,548,300);
        platform4.setLocation(567,301);
        platform4.setLocation(207,204);
        platform4.setLocation(207,206);
        musuh musuh5 = new musuh();
        addObject(musuh5,83,173);
        musuh5.setLocation(327,170);
        musuh5.setLocation(327,178);
        platform platform5 = new platform(300, 20);
        addObject(platform5,868,74);
        platform platform6 = new platform(300, 20);
        addObject(platform6,868,342);
        musuh musuh6 = new musuh();
        addObject(musuh6,973,309);
        dirt dirt = new dirt(600, 60);
        addObject(dirt,505,568);
        dirt.setLocation(802,558);
        dirt.setLocation(696,567);
        dirt.setLocation(773,567);
        dirt.setLocation(736,570);
        dirt.setLocation(814,560);
        dirt.setLocation(784,567);
        dirt.setLocation(762,581);
        dirt.setLocation(816,565);
        dirt.setLocation(908,587);
        dirt.setLocation(905,584);
        dirt.setLocation(721,531);
        dirt.setLocation(968,574);
        dirt.setLocation(699,568);
        dirt dirt2 = new dirt(300, 60);
        addObject(dirt2,85,566);
        dirt2.setLocation(30,573);
        dirt2.setLocation(412,425);
        dirt2.setLocation(373,417);
        dirt2.setLocation(245,435);
        removeObject(dirt2);
        addObject(dirt2,125,556);
        dirt2.setLocation(-24,561);
        dirt2.setLocation(109,576);
        dirt2.setLocation(67,562);
        dirt2.setLocation(59,565);
        dirt2.setLocation(77,566);
        dirt2.setLocation(87,563);
        dirt2.setLocation(-17,559);
        dirt2.setLocation(68,565);
        dirt2.setLocation(45,570);
        dirt2.setLocation(96,549);
        removeObject(dirt2);
        addObject(dirt2,93,570);
        dirt2.setLocation(102,565);
        dirt2.setLocation(92,560);
        dirt2.setLocation(109,560);
        dirt2.setLocation(76,568);
        dirt2.setLocation(123,566);
        dirt2.setLocation(81,562);
        dirt2.setLocation(101,563);
        dirt2.setLocation(96,568);
        dirt2.setLocation(109,564);
        dirt2.setLocation(92,569);
        dirt2.setLocation(92,562);
        dirt2.setLocation(72,569);
        dirt2.setLocation(164,550);
        removeObject(dirt2);
        dirt2 = new dirt(140, 60);
        addObject(dirt2,96,568);
        dirt2.setLocation(111,571);
        dirt2.setLocation(84,565);
        dirt2.setLocation(75,568);
        dirt2.setLocation(76,566);
        dirt2.setLocation(72,573);
        pakuatas pakuatas = new pakuatas();
        addObject(pakuatas,207,581);
        pakuatas pakuatas2 = new pakuatas();
        addObject(pakuatas2,335,582);
        paku paku = new paku();
        addObject(paku,1,428);
        pakuatas pakuatas3 = new pakuatas();
        addObject(pakuatas3,426,342);
        removeObject(pakuatas3);
        paku paku2 = new paku();
        addObject(paku2,62,257);
        paku paku3 = new paku();
        addObject(paku3,484,298);
        pakuatas3 = new pakuatas();
        addObject(pakuatas3,844,504);
        paku paku4 = new paku();
        addObject(paku4,778,111);
        musuh4.setLocation(689,516);
        door door = new door();
        addObject(door,958,26);
        door.setLocation(961,48);
        paku4.setLocation(788,162);
        platform5.setLocation(836,106);
        paku4.setLocation(828,115);
        platform5.setLocation(761,139);
        paku4.setLocation(749,139);
        platform5.setLocation(787,201);
        platform5.setLocation(845,112);
        paku4.setLocation(775,135);
        door.setLocation(963,74);
        paku4.setLocation(768,151);
        paku4.setLocation(835,253);
        platform5.setLocation(851,135);
        paku4.setLocation(753,153);
        paku4.setLocation(759,171);
        pemain = new player(joystick);
        addObject(pemain, 50, 517);
        healthBar = new HealthBar(pemain.getHealth()); 
        addObject(healthBar, 52, 50);
        paku.setLocation(135,426);
        paku.setLocation(145,416);
        platform.setLocation(176,403);
        platform.setLocation(180,403);
        platform.setLocation(143,400);
        musuh2.setLocation(267,373);
        paku.setLocation(171,414);
        paku.setLocation(163,414);
        removeObject(paku);
    }
    
    public void tambahSkor(int value) {
        if (score != null) { // Periksa apakah score tidak null
            score.addScore(value); // Tambahkan skor
        }
    }

}
