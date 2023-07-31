import java.util.Scanner;

public class ma_tran_xoay_oc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

        int r = 0, num = 0;
        while( r <= n-r-1){
            for(int j=r ; j < n-r - 1; ++j){
                a[r][j] = ++num;
            }
            if(num >= n*n) break;
            for(int i=r; i< n - r -1; ++i){
                a[i][n-r-1] = ++num;
            }
            if(num >= n*n) break;
            for(int j = n-r-1; j>r; --j){
                a[n-r-1][j] = ++num;
            }
            if(num >= n*n) break;
            for(int i = n - r- 1; i>r; --i){
                a[i][r] = ++num;
            }
            if(num >= n*n) break;
            ++r;
        }
        if(n%2 == 1){
            a[n/2][n/2] = ++num;
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
