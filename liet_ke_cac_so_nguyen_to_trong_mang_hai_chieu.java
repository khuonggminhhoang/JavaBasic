import java.util.Scanner;

public class liet_ke_cac_so_nguyen_to_trong_mang_hai_chieu {
    public static boolean isPrime(int n){
        for(int i=2; i<= Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return n > 1;
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
            for(int j=0; j<m; ++j){
                if(isPrime(a[i][j])){
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
