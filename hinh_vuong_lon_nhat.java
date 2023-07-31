import java.util.Scanner;

public class hinh_vuong_lon_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }

        long max = Integer.MIN_VALUE;
        for(int i=0; i<n-2; ++i){
            for(int j=0; j<n-2; ++j){
                max = Math.max(a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2], max);
            } 
        }
        System.out.println(max);
    }
}
