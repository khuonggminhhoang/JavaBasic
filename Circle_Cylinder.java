import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Circle{
    private double radius;
    private String color;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }
}

class Cylinder extends Circle{
    private double height;

    Cylinder(){}

    Cylinder(double radius){
        super.setRadius(radius);
    }

    Cylinder(double radius, double height){
        super.setRadius(radius);
        this.height = height;
    }

    Cylinder(String color, double radius, double height){
        super(radius, color);
        this.height = height;
       
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString(){
        return "Color : " + super.getColor() + "\n"
            + "Height : " + String.format("%.2f", this.height) + "\n"
            + "Radius : " + String.format("%.2f", super.getRadius()) + "\n"
            + "Volume : " + String.format("%.2f", getVolume()) + "\n"
            + "-------------------";

    }
}

public class Circle_Cylinder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        Cylinder[] arr = new Cylinder[n];
        for(int i=0; i<n; ++i){
            String color = scn.next();
            double radius = scn.nextDouble();
            double height = scn.nextDouble();
            arr[i] = new Cylinder(color, radius, height);
        }
        Arrays.sort(arr, new Comparator<Cylinder>(){

            @Override
            public int compare(Cylinder o1, Cylinder o2) {
                if(o1.getVolume() > o2.getVolume()){
                    return -1;
                }
                else if(o1.getVolume() < o2.getVolume()){
                    return 1;
                }
                else{
                    return o1.getColor().compareTo(o2.getColor());
                }
            }

        });

        for(Object x : arr){
            System.out.println(x);
        }
        scn.close();
    }
}
