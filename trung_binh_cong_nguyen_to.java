import java.util.Scanner;

public class trung_binh_cong_nguyen_to {
    public static boolean isPrime(int n){
        for(int i=2; i<= Math.sqrt(n) ; ++i){
            if(n%i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        
        for(int i = 0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        int cnt = 0, ans = 0, sum = 0;
        for(int x : a){
            if(isPrime(x)){
                ++cnt;
                sum += x;
            }
        }
        System.out.printf("%.3f",1d*sum/cnt);
    }
}
