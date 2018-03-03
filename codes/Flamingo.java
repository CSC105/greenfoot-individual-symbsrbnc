import greenfoot.*;
public class Flamingo extends Actor
{
    public static int life=3; 
    GreenfootImage[] flamingo= new GreenfootImage[36];
    private int x;
    private int y;
    private int speed;//actor speed
    private boolean grounded;
    public static int countDiamond=0;
    boolean fireRate;
    int s=610;
    public Flamingo(int x,int y){
        for(int i=0;i<36;i++){
            flamingo[i]=new GreenfootImage("Flamingo"+(i+1)+".png");
        }
        this.x=x;
        this.y=y;
        setLocation(x,y);
    }
    int img=0;
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            img += 1;
            x += 3;
        }
        if(Greenfoot.isKeyDown("left")){
            img -= 1;
            x -= 3;
        }
        if(Greenfoot.getKey()==("up")&& grounded){
            Greenfoot.playSound("jump.wav");
            speed -= 35;
            grounded = false;
        }
        if(Greenfoot.isKeyDown("space")&&!fireRate) {
            Greenfoot.playSound("shoot_1.wav");
            fireRate = true;
            getWorld().addObject(new FlowerBullet(), getX(), getY());
        }
        if(!Greenfoot.isKeyDown("space")&&fireRate){
            fireRate = false;
        }

        while(img<0){img+=35;}
        while(img>35){img-=36;}
        setImage( flamingo[img]);
        flamingo[img].scale(75,150);
        //move
        if(y>300){speed=0;y=300;}//ground
        if(y==300){grounded=true;}else{grounded=false;}
        y+=speed;
        if(speed<15 && !grounded){
            speed +=3;
        }
        setLocation(this.x,this.y);
        if(foundDiamond()) {
            Greenfoot.playSound("collect.wav");
            collectDiamond();
        }
        if(seeCactus()) {
            Greenfoot.playSound("die.mp3");
            touchCactus();
        }
        if(seeHunter()) {
            Greenfoot.playSound("die.mp3");
            touchHunter();
        }
    }

    public boolean foundDiamond(){
        Actor diamond=getOneObjectAtOffset(0,0,Diamond.class);
        if(diamond!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public void collectDiamond(){
        Actor diamond = getOneObjectAtOffset(0, 0, Diamond.class);
        if(diamond != null) {
            getWorld().removeObject(diamond);
            countDiamond = countDiamond + 1;
            DiamondCounter.diamondCounter++;
            if(countDiamond==10){
                Greenfoot.playSound("winning.wav");
                ((Game)getWorld()).backgroundMusic.stop();
                Greenfoot.setWorld(new ScoreBoard());
            }    
        }    
    }

    public boolean seeCactus(){
        Actor cactus=getOneObjectAtOffset(0,0,Cactus.class);
        if(cactus!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean seeHunter(){
        Actor hunter=getOneObjectAtOffset(0,0,Gunman.class);
        if(hunter!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void touchCactus(){
        Actor cactus = getOneObjectAtOffset(0, 0, Cactus.class);
        if(getOneIntersectingObject(Cactus.class) != null) {   
            getWorld().removeObject(cactus);
            life=life-1;

            if(life==0){
                Greenfoot.playSound("gameover.wav");           
                ((Game)getWorld()).backgroundMusic.stop();
                Greenfoot.setWorld(new ScoreBoard());
            } 
            updateHeart(life);
        }    
    }
    public void touchHunter(){
        Actor hunter = getOneObjectAtOffset(0, 0, Gunman.class);
        if(getOneIntersectingObject(Gunman.class) != null) {   
            getWorld().removeObject(hunter);
            life=life-1;

            if(life==0){
                Greenfoot.playSound("gameover.wav");           
                ((Game)getWorld()).backgroundMusic.stop();
                Greenfoot.setWorld(new ScoreBoard());
            } 
            updateHeart(life);
        }    
    }

    public void updateHeart(int numLife){
        getWorld().removeObjects(getWorld().getObjects(Pixelheart1.class));
        for(int i=0;i<numLife;i++){
            s+=40;
            getWorld().addObject(new Pixelheart1(),s,50);

        }
    }
}

