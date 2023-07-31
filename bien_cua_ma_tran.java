import java.util.Scanner;

public class bien_cua_ma_tran {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<n; ++i){
            for(int j=0 ; j<n; ++j){
                if(i == 0 || i == n-1){
                    System.out.print(a[i][j] + " ");
                }
                else if(j == 0 || j == n-1){
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        scn.close();
    }
}