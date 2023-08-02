import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Vehicle{
    protected String code;
    protected String name;
    protected String company;
    protected String color;
    protected int price;

    Vehicle(){}

    Vehicle(String code, String name, String company, String color, int price){
        this.code = code;
        this.name = name;
        this.company = company;
        this.color = color;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getCompany(){
        return this.company;
    }

    public int getPrice(){
        return this.price;
    }

    public String getCode(){
        return this.code;
    }

    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.company + " " + this.color;
    }

}

class Motorbike extends Vehicle{
    private int speed;

    Motorbike(){}

    Motorbike(String code, String name, String company, String color, int speed, int price){
        super(code, name, company, color, price);
        this.speed = speed;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.speed + " " + this.price;
    }
}

class Car extends Vehicle{
    private int horsePower;

    Car(){}

    Car(String code, String name, String company, String color, int horsePower, int price){
        super(code, name, company, color, price);
        this.horsePower = horsePower;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.horsePower + " " + this.price;
    }
}

public class quan_li_xe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        ArrayList <Motorbike>  arrMoto = new ArrayList<>();
        ArrayList <Car> arrCar = new ArrayList<>();
        while(n-- > 0){
            String code = scn.nextLine();
            String name = scn.nextLine();
            String company = scn.nextLine();
            String color = scn.nextLine();

            String tmp = "";
            for(char x : code.toCharArray()){
                if(!Character.isDigit(x)){
                    tmp += x;
                }
            }

            if(tmp.equals("XM")){
                int speed = Integer.parseInt(scn.nextLine());
                int price = Integer.parseInt(scn.nextLine());
                Motorbike moto = new Motorbike(code, name, company, color, speed, price);
                arrMoto.add(moto);
            }
            else{
                int horsePower = Integer.parseInt(scn.nextLine());
                int price = Integer.parseInt(scn.nextLine());
                Car car = new Car(code, name, company, color, horsePower, price);
                arrCar.add(car);
            }
        }

        String findVehicle = scn.nextLine();

        System.out.println("DANH SACH OTO :");
        for(Car car : arrCar){
            if(car.getName().equals(findVehicle)){
                System.out.println(car);
            }
        }

        System.out.println("DANH SACH XE MAY :");
        for(Motorbike moto : arrMoto){
            if(moto.getName().equals(findVehicle)){
                System.out.println(moto);
            }
        }
        scn.close();
    }
}
