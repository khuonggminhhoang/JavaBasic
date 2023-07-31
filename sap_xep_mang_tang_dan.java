import java.util.Arrays;
import java.util.Scanner;

public class sap_xep_mang_tang_dan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        //nhap mang
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        //sap xep
        Arrays.sort(a);
        for(Integer x : a) {
            System.out.print(x + " ");
        }
    }
}
