import java.util.Scanner;

public class in_ma_tran_theo_mau {
    public static void print(int[][] a , int n){
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        int[][] tmp = new int[n][n];
        for(int i=0; i<n; ++i)
            for(int j=0; j<n; ++j)
                a[i][j] = scn.nextInt();

        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                tmp[i][j] = a[j][i];
            }
        }
        System.out.println("Pattern 1:");
        print(tmp, n);

        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                tmp[i][j] = a[n-1-i][n-1-j];
            }
        }
        System.out.println("Pattern 2:");
        print(tmp,n);

        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                tmp[i][j] = a[j][n-1-i];
            }
        }
        System.out.println("Pattern 3:");
        print(tmp,n);

        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                tmp[i][j] = a[i][n-1-j];
            }
        }
        System.out.println("Pattern 4:");
        print(tmp,n);
        scn.close();
    }
}
