import java.util.Scanner;

class Point{
    private double x, y;
    
    Point(){};

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double[] getXY(){
        double[] ans = new double[2];
        ans[0] = this.x;
        ans[1] = this.y;
        return ans;
    }

    @Override
    public String toString(){
        return "X : " + String.format("%.2f",this.x) + "\nY : " + String.format("%.2f",this.y);
    }
}

class MovablePoint extends Point{
    private double xSpeed, ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

    public double getXSpeed() {
        return xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed(){
        double[] ans = new double[2];
        ans[0] = this.xSpeed;
        ans[1] = this.ySpeed;
        return ans;
    }

    @Override
    public String toString(){
        return super.toString() + "\nX Speed : " + String.format("%.2f", this.xSpeed) 
         + "\nY Speed : " + String.format("%.2f", this.ySpeed) + "\n-------------------";
    }

    public MovablePoint move(int m){
        double X = super.getX() + m*this.xSpeed;
        double Y = super.getY() + m*this.ySpeed;
        MovablePoint ans = new MovablePoint(X,Y,xSpeed, ySpeed);
        return ans;
    }
}

public class point_movablePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i<n; ++i){
            MovablePoint p = new MovablePoint(scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble());
            int m = scn.nextInt();
            System.out.println(p.move(m));
        }
        scn.close();
    }
}
