import java.util.Scanner;

public class mang_cong_don {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i) a[i] = scn.nextInt();

        // xay dung mang cong don
        int[] F = new int[n];
        F[0] = a[0];
        for(int i=1; i<n; ++i){
           F[i] = F[i-1] + a[i];
        }

        for(int i=0; i<n; ++i){
            System.out.print(F[i] + " ");
        }
    }
}
