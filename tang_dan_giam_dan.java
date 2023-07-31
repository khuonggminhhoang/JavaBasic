import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;

public class tang_dan_giam_dan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        for(int x : a) System.out.print(x + " ");
        System.out.println();
        Arrays.sort(a, Collections.reverseOrder());
        for(int x : a) System.out.print(x + " ");
    }
}
