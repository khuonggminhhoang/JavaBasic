import java.util.Scanner;

public class ma_tran_xoay_oc_fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] fibo = new long[92];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<= n*n; ++i){
            fibo[i] = fibo[i-1] + fibo[i-2];
        } 
        long[][] a = new long[n][n];
        int r = 0, cnt =0;
        while( r <= n-r-1){
            for(int j=r ; j < n-r - 1; ++j){
                a[r][j] = fibo[cnt++];
            }
            if( r > n-r-1 ) break;
            for(int i=r; i< n - r -1; ++i){
                a[i][n-r-1] = fibo[cnt++];
            }
            if( r > n-r-1 ) break;
            for(int j = n-r-1; j>r; --j){
                a[n-r-1][j] = fibo[cnt++];
            }
            if( r > n-r-1 ) break;
            for(int i = n - r- 1; i>r; --i){
                a[i][r] = fibo[cnt++];
            }
            ++r;
        }
        if(n%2 == 1){
            a[n/2][n/2] = fibo[cnt];
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
