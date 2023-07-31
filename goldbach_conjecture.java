import java.util.Scanner;

public class goldbach_conjecture {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            for(int i= 2; i<= n/2; ++i){
                if(isPrime(i) && isPrime(n-i)){
                    System.out.println(i + " " + (n-i));
                }
            }
        }
    }
}
