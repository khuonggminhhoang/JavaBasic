import java.util.Scanner;

public class hoan_vi_hai_hang_cua_ma_tran {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i)
            for(int j=0; j<n; ++j)
                a[i][j] = scn.nextInt();

        int row1 = scn.nextInt() , row2 = scn.nextInt();
        for(int j = 0; j<n; ++j){
            int tmp = a[row1-1][j];
            a[row1-1][j] = a[row2-1][j];
            a[row2-1][j] = tmp;
        }
        for(int i=0; i<n; ++i){
            for(int j = 0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
