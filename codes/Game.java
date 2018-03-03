import greenfoot.*; 
public class Game extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("background.mp3");
    private int a=0;
    public Game()
    {    

        super(750,400, 1);
        GreenfootImage background = new GreenfootImage("background3.jpg");
        background.scale(750,400);
        setBackground(background);
        backgroundMusic.playLoop();
        addObject(new Flamingo(50,40),0,0);
        addObject(new Score(),75,50);
        addObject(new DiamondCount(),225,50);
        int x=610;
        for(int i=0;i<Flamingo.life;i++){
            addObject(new Pixelheart1(),x,50);
            x+=40;
        }
        Flamingo.life=3;
        addObject(new Counter(),96,52);
        addObject(new DiamondCounter(),246,52);
    }

    public void act()
    {
        if(a>0)a--;
        else a=200;
        if(a==1){
            addObject(new Gunman(-(3+Greenfoot.getRandomNumber(15))),750,325);
            addObject(new Diamond(-(3+Greenfoot.getRandomNumber(20))),750,300);
            addObject(new Cactus(-(3+Greenfoot.getRandomNumber(7))),750,325);

        }
    }
}
