import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape{
    protected String color;
    protected Boolean filled;
    
    protected Shape(){}

    protected Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    };

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Color : " + this.color + "\nFilled : " + this.filled;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle( double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    };

    public double getRadius(){
        return this.radius;
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
        return "-----------------------" +
        "\nRadius : " + String.format("%.2f",this.radius)  
        + "\nColor : " + this.color + "\nFilled : " + this.filled
        + "\nPerimeter : " + String.format("%.2f",this.getPerimeter())
        + "\nArea : " + String.format("%.2f",this.getArea())
        + "\n-----------------------";
    }
}

class Rectangle extends Shape{

    private double width;
    private double length;
    
    public Rectangle(){};
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return this.width * this.length;
    }
        @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    
    @Override
    public String toString() {
        return "-----------------------" + 
        "\nWidth : "+ String.format("%.2f", this.width)
        + "\nLength : " + String.format("%.2f", this.length)
        + "\nColor : " + this.color + "\nFilled : " + this.filled
        + "\nPerimeter : " + String.format("%.2f",this.getPerimeter())
        + "\nArea : " + String.format("%.2f",this.getArea())
        + "\n-----------------------";
    }
}


class Square extends Rectangle{
    public Square() {}
    
    public Square(double side){
        super(side, side);
    } 

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "-----------------------" +
        "\nSide : " + String.format("%.2f", this.getSide()) 
        + "\nColor : " + this.color
        + "\nFilled : " + this.filled
        + "\nPerimeter : " + String.format("%.2f", super.getPerimeter())
        + "\nArea : " + String.format("%.2f",this.getArea())
        + "\n-----------------------";
    }

}

public class shape_abstract_class {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        ArrayList <Square> arrSquare = new ArrayList<>();
        ArrayList <Circle> arrCircle = new ArrayList<>();
        ArrayList <Rectangle> arrRectangle = new ArrayList<>();
        for(int i=0; i<n; ++i){
            char tmp = scn.next().charAt(0);
            if(tmp == 'S'){
                double side = Double.parseDouble(scn.next());
                String color = scn.next();
                boolean filled = (scn.next().equals("true")) ? true : false;
                Square obj = new Square(side, color, filled);
                arrSquare.add(obj);
            }
            else if( tmp == 'C'){
                double radius =  Double.parseDouble(scn.next());
                String color = scn.next();
                boolean filled = (scn.next().equals("true")) ? true : false;
                Circle obj = new Circle(radius, color, filled);
                arrCircle.add(obj);
            }
            else{
                double length = Double.parseDouble(scn.next());
                double width = Double.parseDouble(scn.next());
                String color = scn.next();
                boolean filled = (scn.next().equals("true")) ? true : false;
                Rectangle obj = new Rectangle(Math.min(width, length), Math.max(width, length), color, filled);
                arrRectangle.add(obj);
            }
        } 
        System.out.println("Circle :");
        for(Object x : arrCircle){
            System.out.println(x);
        }
        System.out.println("Rectangle :");
        for(Object x : arrRectangle){
            System.out.println(x);
        }

        System.out.println("Square :");
        for(Object x : arrSquare){
            System.out.println(x);
        }
        scn.close();
    }
}
