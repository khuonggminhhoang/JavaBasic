import java.util.Scanner;

public class tim_so_lon_nhat_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        int minElement = Integer.MAX_VALUE, maxElement = Integer.MIN_VALUE;
        for(int x : a){
            if(x > maxElement) maxElement = x;
            if(x < minElement) minElement = x;
        }
        System.out.println(maxElement);
        System.out.println(minElement);
    }
}
