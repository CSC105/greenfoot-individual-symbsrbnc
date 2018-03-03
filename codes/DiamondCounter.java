import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DiamondCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamondCounter extends Actor
{
     public static int diamondCounter=0;
    public DiamondCounter(){
        setImage(new GreenfootImage("0",24,Color.BLACK,Color.WHITE));
    }

    public void act() 
    {
        setImage(new GreenfootImage(""+diamondCounter,24,Color.BLACK,Color.WHITE));
    }      
}
