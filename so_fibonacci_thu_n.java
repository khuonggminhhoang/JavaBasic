import java.util.Scanner;

public class so_fibonacci_thu_n {
    public static long fibo(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        long f1 = 1, f2 = 0, fn = 0;
        for(int i=3; i<=n; ++i){
            fn = f1 + f2;
            fn %= 1000000007;
            f2 = f1;
            f1 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       // long ans = fibo(n);
        System.out.println(fibo(n));
    }
}
