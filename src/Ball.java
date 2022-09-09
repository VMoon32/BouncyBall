import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int offsetX = 10;
    private int offsetY = 10;

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();

        x += offsetX;
        y += offsetY;

        if(y >= getWorld().getHeight() || y <= 0){
            offsetY *= -1;
        }

        if(x >= getWorld().getWidth() || x <= 0){
            offsetX *=-1;
        }
        setLocation(x, y);
    }
}
