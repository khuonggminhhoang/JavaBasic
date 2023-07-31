import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class tron_hai_day_va_sap_xep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n],
              b = new Integer[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        for(int i=0; i<n; ++i) b[i] = scn.nextInt();
        Arrays.sort(a);
        Arrays.sort(b, new Comparator<Integer>() {
           public int compare(Integer o1, Integer o2){
                return o2 - o1;
           } 
        });
        
        for(int i=0; i<n; ++i){
            System.out.print(a[i] + " " + b[i] + " ");
        }
    }
}
