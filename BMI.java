import java.util.Scanner;

public class BMI {
     public static void main(String[] args){
        double wei,high;
        Scanner scn = new Scanner(System.in);
        wei = scn.nextDouble();
        high = scn.nextDouble();
        double BMI = wei/Math.pow(high, 2);
        if(BMI < 15){
            System.out.printf("very thin BMI = %.2f \n", BMI);
        }
        else if(BMI>=15 && BMI < 16){
            System.out.printf("thin BMI = %.2f \n",BMI);
        }
        else if(BMI >= 16 && BMI < 18.5){
            System.out.printf("thin thin BMI = %.2f\n",BMI);
        }
        else if(BMI>=18.5 && BMI <25){
            System.out.printf("normal BMI = %.2f\n", BMI);
        }
        else if(BMI >= 25 && BMI <30){
            System.out.printf("fat fat BMI = %.2f\n", BMI);
        }
        else if(BMI >= 30 && BMI < 35){
            System.out.printf("fat BMI = %.2f\n", BMI);
        }
        else {
            System.out.printf("so fat BMI = %.2f\n",BMI);
        }
        int x;
        x = scn.nextInt();
        switch(x){
            case 1 : {
                System.out.println("hi");
                break;
            }
            default : {
                System.out.println("hello");
                break;
            }
        }
        scn.close();
    }
}
