import java.util.Arrays;
import java.util.Scanner;

public class mang_danh_dau_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] t = new int[1000001];

        for(int i = 0; i<n; ++i){
            a[i] = scn.nextInt();
            t[a[i]]++;
        }

        Arrays.sort(a);
        for(int i = 0; i<= 1000000; ++i){
            if(t[i] != 0) System.out.println(i + " " + t[i]);
        }

    }
}
