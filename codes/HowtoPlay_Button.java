import greenfoot.*;
public class HowtoPlay_Button extends Actor
{
    public HowtoPlay_Button(){
        GreenfootImage button = new GreenfootImage("howtoplaybutton.png");
        setImage(button);
        button.scale(150,75);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            play();
            Greenfoot.setWorld(new HowtoPlay());
        }
    }

    public void play(){
        Greenfoot.playSound("click.wav");
    }
}
