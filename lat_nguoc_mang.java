import java.util.Scanner;

public class lat_nguoc_mang {
    public static void reverseArr(int[] a, int n){
        for(int i=0; i< n/2; ++i){
            int tmp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int  i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        reverseArr(a, n);
        for(int x : a){
            System.out.print(x + " ");
        }

    }
}
