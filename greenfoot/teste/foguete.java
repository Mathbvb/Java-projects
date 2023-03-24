import greenfoot.*;  

public class foguete extends Actor
{
    int velocidade = 9;
    SimpleTimer timer = new SimpleTimer();
    public void act() 
    {
        anda();
        if(Greenfoot.isKeyDown("space")){
            atira();
        }
    }
    
    public void anda(){
        if(Greenfoot.isKeyDown("D")){
        move(velocidade);
    }
        else if(Greenfoot.isKeyDown("A")){
        move(-velocidade);
    }
        else if(Greenfoot.isKeyDown("S")){
        setLocation(getX(), getY()+velocidade);
    }
        else if(Greenfoot.isKeyDown("W")){
        setLocation(getX(), getY()-velocidade);
    }    
    }
    
    public void atira(){
        if (timer.millisElapsed() > 500 && Greenfoot.isKeyDown("space")){
        getWorld().addObject(new laser(), getX(), getY());
        timer.mark();
        }
    }
}
