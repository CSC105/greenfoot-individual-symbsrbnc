import greenfoot.*;
public class HowtoPlay extends World
{
    public HowtoPlay()
    {    
        super(750,400, 1);
        GreenfootImage background = new GreenfootImage("background4.jpg");
        background.scale(750,400);
        setBackground(background);
        buttons();
    }
     public void buttons(){
       addObject(new Start_Button(80,40),690,375);
       addObject(new Menu_Button(80,40),60,375);
    }
}
