import greenfoot.*; 
public class Counter extends Actor
{
    public static int scoreCounter=0;
    public Counter(){
        setImage(new GreenfootImage("0",24,Color.BLACK,Color.WHITE));
    }

    public void act() 
    {
        setImage(new GreenfootImage(""+scoreCounter,24,Color.BLACK,Color.WHITE));
    }    
}
