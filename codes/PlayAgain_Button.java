import greenfoot.*;
public class PlayAgain_Button extends Actor
{   
    public PlayAgain_Button(){
        GreenfootImage button = new GreenfootImage("playagainButton.png");
        setImage(button);
        button.scale(100,50);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            play();
            Counter.scoreCounter=0;
            DiamondCounter.diamondCounter=0;
            Flamingo.life=3;
            Greenfoot.setWorld(new Game());

        } 
    }

    public void play(){
        Greenfoot.playSound("click.wav");
    }
}
