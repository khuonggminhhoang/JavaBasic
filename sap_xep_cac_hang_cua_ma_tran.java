import java.util.Scanner;

public class sap_xep_cac_hang_cua_ma_tran {
    public static void sortRaw(int[][] a, int n, int i){
        for(int j=0; j<n-1; ++j){
            for(int k = j+1; k <n; ++k){
                if(a[i][j] > a[i][k]){
                    int tmp = a[i][j];
                    a[i][j] = a[i][k];
                    a[i][k] = tmp;
                }
            }
        }
    }

    public static void sortCol(int[][] a, int n,  int j){
        for(int i=0; i<n-1; ++i){
            for(int k = i+1;  k<n; ++k){
                if(a[i][j] > a[k][j]){
                    int tmp = a[i][j];
                    a[i][j] = a[k][j];
                    a[k][j] = tmp;
                }
            }
        }
    }

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
            sortCol(a,n,i);
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
