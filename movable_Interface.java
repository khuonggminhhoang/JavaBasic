import java.util.Scanner;

interface Movable{
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}

class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return this.x + " " + this.y;
    }

    @Override 
    public void moveUp(){
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
    
}

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle( int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override 
    public void moveUp(){
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
    @Override
    public String toString() {
        return center.toString();
    }
}

public class movable_Interface {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n-->0){
            MovableCircle obj = new MovableCircle(scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt());
            int m = scn.nextInt();
            scn.nextLine();
            for(int i=0; i<m; ++i){
                String tmp = scn.nextLine();
                if(tmp.equals("Down")){
                    obj.moveDown();
                }
                else if(tmp.equals("Up")){
                    obj.moveUp();
                }
                else if(tmp.equals("Left")){
                    obj.moveLeft();
                }
                else{
                    obj.moveRight();
                }
            }
            System.out.println(obj);
        }
    }
}