import java.util.Scanner;

public class can_bang_nguyen_to {
    public static boolean isPrime(int n){
        for(int i=2 ; i<= Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
            sum += a[i];
        }

        for(int i=1; i<n-1; ++i){
            int sum1 = 0;
            for(int j = 0; j<i; ++j){
                sum1 += a[j];
            }
            if(isPrime(sum1) && isPrime(sum - a[i] - sum1)) System.out.print(i + " ");
        }

    }
}
