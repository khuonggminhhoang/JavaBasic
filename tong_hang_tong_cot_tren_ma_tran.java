import java.util.Scanner;

public class tong_hang_tong_cot_tren_ma_tran {
    public static long sumRaw(int a[][], int n, int m, int i){
        long sum = 0;
        for(int j = 0; j<m; ++j){
            sum += a[i][j];
        }
        return sum;
    }

    public static long sumCol(int a[][], int n, int m, int j){
        long sum = 0;
        for(int i=0; i<n; ++i){
            sum += a[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<n; ++i){
            System.out.print(sumRaw(a, n, m, i) + " ");
        }
        System.out.println();
        for(int j=0; j<m; ++j){
            System.out.print(sumCol(a,n,m,j) + " ");
        }
        scn.close();
    }
}
