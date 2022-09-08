import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    public Ball(int direction){
        setRotation(direction);
    }
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // nota: No usar ciclos
        /*int x = getX();
        int y = getY();
        setLocation(x+5, y-5);*/

        move(5);

        bounceEdge();
        //setRotation(45);


        /*if(getX()>getWorld().getWidth()-40 || getY()>getWorld().getHeight()-40){
            turn(143);
        }else if(getX()<60 || getY()<60){
            turn(143);
        }*/

        /*if(getX()>rightSide -1 || y == 0){
            turn(143);
        }else if(x == 0 || getY()>bottomSide -1){
            turn(143);
        }*/





    }

    //Método para decirme si toqué el borde y cuál borde
    //ME GUSTÓ PERO DESCUBRI EL "isAtEdge()" asi que no le di uso despúes

    public String whichEdge(){
        int x = getX();
        int y = getY();
        World myWorld = getWorld();
        int rightSide = myWorld.getWidth() - 1;
        int bottomSide = myWorld.getHeight() - 1;

        if(y == 0){
            return "top";
        }else if(x == 0){
            return "left";
        }else if(x == rightSide){
            return "right";
        }else if(y == bottomSide){
            return "bottom";
        }else{
            return null;
        }
    }

    //Bouncer

    public void bounceEdge(){
        //String edge = whichEdge();

        if(isAtEdge()){
            turn(135);
            /*... NO FUNCIONO: else if(i==0 && j<5){
                turn(315);
                j++;
            }else if(j==6){
                i=6;
            }*////
        }

        //YA NO UTILIZADO DESPUÉS DE DESCUBRIR "isAtEdge()"

        /*else if(isAtEdge()){
            //turn(135);//40
            //horizontalSpeed = horizontalSpeed * -1;
        }
        ///////////////////////////
        if(isAtEdge()){
            turn(135);//90
        }/////////////////////////

        /*if(edge == "top"){
            turn(45);
        }else if(edge == "bottom"){
            turn(45);
        }else if(edge == "left"){
            turn(45);
        }else if(edge == "right"){
            turn(45);
        }*/
    }
}