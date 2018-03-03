import greenfoot.*; 
public class Start_Button extends Actor
{
    public Start_Button(int width,int height){
        GreenfootImage button = new GreenfootImage("startButton.png");
        setImage(button);
        button.scale(width,height);
        //button.scale(150,75);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            play();
            Flamingo.life=3;
            Greenfoot.setWorld(new Game());
        }
    }

    public void play(){
        Greenfoot.playSound("click.wav");
    }
}
