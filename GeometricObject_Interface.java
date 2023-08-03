import java.util.ArrayList;
import java.util.Scanner;

interface GeometricObject{
    public abstract double getArea();
    public abstract double getPerimeter();
}

interface Resizable{
    public abstract void resize(double percent);
}

class Circle implements GeometricObject{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
    
    @Override
    public String toString() {
        return "---------------------"
        + "\nRadius : " + String.format("%.2f", this.radius)
        + "\nPerimeter : " + String.format("%.2f", this.getPerimeter())
        + "\nArea : " + String.format("%.2f", this.getArea())
        + "\n---------------------";
    }
}

class ResizableCircle extends Circle implements Resizable{
    ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent/100;
    }
    
    @Override 
    public String toString(){
        return super.toString();
    }
}


public class GeometricObject_Interface {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n-- > 0){
            ResizableCircle obj = new ResizableCircle(scn.nextDouble());
            int m = scn.nextInt();
            for(int i=0; i<m; ++i){
                obj.resize(scn.nextDouble());
            }
            System.out.println(obj);
        }
    }
}


class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString(){
        return "-----------------------"
        + "\nWidth : " + String.format("%.02f", this.width)
        + "\nLength : " + String.format("%.02f", this.length)
        + "\nPerimeter : " + String.format("%.02f", this.getPerimeter())
        + "\nArea : " + String.format("%.02f", this.getArea())
        + "\n-----------------------";
    }
}