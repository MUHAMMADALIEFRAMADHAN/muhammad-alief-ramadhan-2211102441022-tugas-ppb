import greenfoot.*;  

public class Makanan extends Actor
{
    public void addedToWorld(World Latar)
    {
        setGambar(10);
    }
    
    private void setGambar(int d)
    {
        GreenfootImage image=new GreenfootImage("plum.png");
       
        
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
