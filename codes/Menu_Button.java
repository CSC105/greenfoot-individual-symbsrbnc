import greenfoot.*;
public class Menu_Button extends Actor
{
    public Menu_Button(int width,int height){
        GreenfootImage button = new GreenfootImage("menuButton.png");
        setImage(button);
        button.scale(width,height);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            play();
            Counter.scoreCounter=0;
            DiamondCounter.diamondCounter=0;
            Greenfoot.setWorld(new MyWorld());
        } 
    }

    public void play(){
        Greenfoot.playSound("click.wav");
    }
}
