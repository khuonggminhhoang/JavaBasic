import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int a;
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        if(a%2 ==1){
            System.out.println("Toi khong tinh so le");
        }
        else{
            long sum = 0;
            for(int i=0; i<=a; i+=2){
                sum+=i;
            }
            System.out.println("Sum = " + sum);
        }
    }
}
