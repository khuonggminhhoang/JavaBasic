import java.util.Scanner;

public class Homework7 {
    
    public static double add(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }
    
    public static double mul( double a, double b){
        return a * b;
    }

    public static double div( double a, double b){
        return a/b;
    }

    public static void solve(double a, double b, char c){
        if(c == '+'){
            System.out.println(add(a,b)); 
        }
        if(c == '-') System.out.println(sub(a,b));
        if(c == '*') System.out.println(mul(a,b));
        if(c == '/' && b != 0) System.out.println(div(a,b));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a,b; 
        a = scn.nextDouble();
        b = scn.nextDouble();
        scn.nextLine();
        char c = scn.nextLine().charAt(0);
        solve(a,b,c);
    }
}
