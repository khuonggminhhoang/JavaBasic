import java.util.Scanner;

public class hoan_vi_hai_cot_cua_ma_tran {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i)
            for(int j=0; j<n; ++j)
                a[i][j] = scn.nextInt();

        int col1 = scn.nextInt() , col2 = scn.nextInt();
        for(int i=0; i<n; ++i){
            int tmp = a[i][col1-1];
            a[i][col1-1] = a[i][col2-1];
            a[i][col2-1] = tmp;
        }
        for(int i=0; i<n; ++i){
            for(int j = 0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
