import greenfoot.*;
public class Quit_Button extends Actor
{
    public Quit_Button(){
        GreenfootImage button = new GreenfootImage("quitButton.png");
        setImage(button);
        button.scale(100,50);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            play();
            Counter.scoreCounter=0;
            DiamondCounter.diamondCounter=0;
            Greenfoot.stop();
            Flamingo.life=3;
            Greenfoot.setWorld(new MyWorld());

        } 
    }

    public void play(){
        Greenfoot.playSound("click.wav");
    }   
}
