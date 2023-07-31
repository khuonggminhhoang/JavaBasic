import java.util.Scanner;

public class digital_root {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        while(n>9){
            int sum = 0;
            while(n!=0){
                sum += n%10;
                n/=10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
