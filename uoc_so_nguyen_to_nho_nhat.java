import java.util.Scanner;

public class uoc_so_nguyen_to_nho_nhat {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i<= Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return true;
    }
    
    // public static int uocMin(int n){
    //     if(n==1) return 1;
    //     if(n%2 == 0 ) return 2;
    //     else{
    //         if(isPrime(n)) return n;
    //         else{
    //             for(int i=3; i<= Math.sqrt(n); i+=2){
    //                 if(n%i == 0) return i;
    //             }
    //         }
    //     }
    //     return n;
    // }

    public static int uocMin(int n){
        if(n==1) return 1;
        for(int i=2; i<= Math.sqrt(n); ++i){
            if(n%i == 0) return i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n ; ++i){
            System.out.println(uocMin(i));
        }
    }
}
