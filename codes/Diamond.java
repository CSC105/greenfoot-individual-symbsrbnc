import greenfoot.*; 
public class Diamond extends Actor
{
    private int vx=0;
    private boolean toRemove=false;
    public Diamond()
    {

    }

    public Diamond(int v)
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
        GreenfootImage diamond=new GreenfootImage("diamond.png");
        diamond.scale(25,25);
        setImage(diamond);
        if(!toRemove)move();
        if (isAtEdge()){getWorld().removeObject(this); }
    }

}
