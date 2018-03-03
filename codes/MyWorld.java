import greenfoot.*;
public class MyWorld extends World
{

    public MyWorld()
    {    
        super(750,400, 1);
        GreenfootImage background = new GreenfootImage("background1.jpg");
        background.scale(750,400);
        setBackground(background);
        buttons();
    }
    public void buttons(){
        addObject(new Start_Button(150,75),397,300);
        addObject(new HowtoPlay_Button(),397,200);
        addObject(new Name(),397,118);
    }
    
}
