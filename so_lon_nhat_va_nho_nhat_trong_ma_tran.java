import java.util.Scanner;

public class so_lon_nhat_va_nho_nhat_trong_ma_tran {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<n; ++i){
            for(int j =0; j<m; ++j){
                a[i][j] = scn.nextInt();
                min = Math.min(min,a[i][j]);
                max = Math.max(max,a[i][j]);
            }
        }
        System.out.println(min);
        for(int  i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                if(a[i][j] == min) System.out.println((i + 1) + " " + (j+1));
            }
        }
        System.out.println(max);
        for(int  i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                if(a[i][j] == max) System.out.println((i + 1) + " " + (j+1));
            }
        }
        scn.close();
    }
}
