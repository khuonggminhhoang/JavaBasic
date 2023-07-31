import java.util.Scanner;

public class classSinhVien {
    private String name;
    private String birthday;
    private double mark1, mark2, mark3;

    classSinhVien(String name, String birthday, double d1, double d2, double d3){
        this.name = name;
        this.birthday = birthday;
        this.mark1 = d1;
        this.mark2 = d2;
        this.mark3 = d3; 
    }

    @Override
    public String toString(){
        return this.name + " " +  this.birthday + " " + String.format("%.1f", this.mark1 + this.mark2 + this.mark3 );
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        classSinhVien a = new classSinhVien(scn.nextLine(), scn.nextLine(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble());
        System.out.println(a);
    }
}
