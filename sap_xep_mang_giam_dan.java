import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_mang_giam_dan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        
        Arrays.sort(a,Comparator.reverseOrder());
        for(int x : a) System.out.print(x + " ");
    }
}

/*
 *  sx sử dụng Collection.reverseOrder trong hàm sort 
 * hoặc có thể sử dụng Comparator.reverseOrder
 *  để sx mảng giảm dần
 */
