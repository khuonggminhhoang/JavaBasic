import java.util.Scanner;

public class lon_hon_lien_ke {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        for(int i=1; i<n-1; ++i){
            if(a[i] > a[i-1] && a[i] > a[i+1]){
                System.out.print(a[i] + " ");
            }
        }
    }
}
