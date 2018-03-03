import greenfoot.*; 
public class ScoreBoard extends World
{
    public ScoreBoard()
    {    
        super(750, 400, 1);
        GreenfootImage background=new GreenfootImage("background7.jpg");
        background.scale(750,400);
        setBackground(background);
        buttons();
    }
     public void buttons(){
       addObject(new Score_Button(),400,150);
       addObject(new PlayAgain_Button(),400,250);
       addObject(new Menu_Button(100,50),400,200);
       addObject(new Quit_Button(),400,300);
       addObject(new Counter(),423,152);
       if(Flamingo.countDiamond >=10){
        addObject(new Win(),400,100);
        }
       if(Flamingo.countDiamond <10){
        addObject(new GameOver(),400,100);
        }
    }
    
}
