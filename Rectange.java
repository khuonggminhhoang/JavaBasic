import java.util.Scanner;

public class Rectange {
    private double width;
    private double heigth;
    private String color;

    Rectange(){}
    Rectange(double width, double heigth, String color){
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeigth(){
        return this.heigth;
    }

    public void setHeigth(double heigth){
        this.heigth = heigth;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double findArea(){
        return this.width * this.heigth;
    }

    public double findPerimeter(){
        return 2*(this.width + this.heigth);
    }

    public void print(){
        if(this.width > 0 && this.heigth > 0){
            int p = (int) findPerimeter();
            int s = (int) findArea();
            System.out.println(p + " " + s + " " + this.color);
        }
        else{
            System.out.println("INVALID");
        }
    }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Rectange a = new Rectange(scn.nextDouble(), scn.nextDouble(), scn.next());
        a.print();
    }
}
