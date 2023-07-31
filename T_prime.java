import java.util.Scanner;

public class T_prime {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();  
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(isPrime(i)) System.out.print(1l*i*i + " ");
        }      
    }
}
