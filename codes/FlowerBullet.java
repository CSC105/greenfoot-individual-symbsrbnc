import greenfoot.*;
public class FlowerBullet extends Actor
{
    public FlowerBullet(){
        GreenfootImage shoot=new GreenfootImage("flowershoot.png");
        shoot.scale(10,10);
        setImage(shoot);

    }

    public void act() 
    {   
        setLocation(getX() + speed, getY());
        destroyEnemy();
        if (getWorld() != null && atWorldEdge())
            checkBoundaries();

    }

    public void checkBoundaries()
    {
        if(atWorldEdge()) 
            getWorld().removeObject(this);
    }

    public void destroyEnemy()
    { 
        Actor enemy = getOneObjectAtOffset(0,0,Gunman.class);
        if(enemy != null) {
            Greenfoot.playSound("man.wav");
            Counter.scoreCounter=Counter.scoreCounter+10;
            getWorld().removeObject(enemy);
        }
    }

    public boolean atWorldEdge()
    {
        if(getX() > getWorld().getWidth() - 2)
            return true;
        else
            return false;
    }
    private int speed = 20;
}
