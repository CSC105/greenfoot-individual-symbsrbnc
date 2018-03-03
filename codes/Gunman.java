import greenfoot.*;
public class Gunman extends Actor
{  
    private int vx=0;
    private boolean toRemove=false;
    public Gunman()
    {

    }

    public Gunman(int v)
    {
        vx=v;
    }

    public void move()

    {
        setLocation(getX()+vx,getY());
        if(getX()<-200)toRemove=true;
    }

    public void act() 
    {
        GreenfootImage man=new GreenfootImage("gunman.png");
        man.scale(75,100);
        setImage(man);
        if(!toRemove)move();
        if (isAtEdge()){getWorld().removeObject(this); }

    }  
}
