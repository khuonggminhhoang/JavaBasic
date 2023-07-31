import java.util.Scanner;

public class hoan_vi_duong_cheo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }

        for(int  i=0; i<n; ++i){
            for(int j=0; j<=i; ++j){
                if(i == j){
                    int tmp = a[i][j];
                    a[i][j] = a[i][n-1-j];
                    a[i][n-1-j] = tmp;
                }
            }
        }

        for(int i=0; i<n; ++i){
            for(int j = 0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
