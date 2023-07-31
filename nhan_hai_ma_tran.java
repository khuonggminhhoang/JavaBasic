import java.util.Scanner;

public class nhan_hai_ma_tran {
    public static long Mul(int[][] a, int[][] b,int n, int m, int raw, int col){
        long sum = 0;
        for(int i=0; i<m; ++i){
            sum += a[raw][i] * b[i][col];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt(), p = scn.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][p];
        long[][] c = new long[n][p];
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<m; ++i){
            for(int j=0; j<p; ++j){
                b[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<p; ++j){
                c[i][j] = Mul(a,b,n,m,i,j);
            }
        }
        for(int i=0; i<n; ++i){
            for(int j = 0; j<p; ++j){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
