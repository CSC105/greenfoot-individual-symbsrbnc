import greenfoot.*;
public class Cactus extends Actor
{  
    private int vx=0;
    private boolean toRemove=false;
    public Cactus()
    {

    }

    public Cactus(int v)
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
        GreenfootImage cactus=new GreenfootImage("cactus.png");
        cactus.scale(75,100);
        setImage(cactus);
        if(!toRemove)move();
        if (isAtEdge()){getWorld().removeObject(this); }
    }  
}
