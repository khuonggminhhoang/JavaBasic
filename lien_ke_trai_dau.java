import java.util.Scanner;

public class lien_ke_trai_dau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        for(int i=0; i<n; ++i){
            if(i == 0){
                if( 1l * a[i] * a[i+1] < 0) System.out.print(a[i] + " ");
            }
            else if(i == n-1){
                if(1l * a[i] * a[i-1] < 0) System.out.print(a[i] + " ");
            }
            else if(a[i] * a[i+1] * 1l < 0 | 1l * a[i] * a[i-1] < 0) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
