import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class xep_gach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a, Collections.reverseOrder());
        int ans=1;
        int doCung = a[0];
        for(int i = 1; i<n ;++i){
            if(doCung == 0) break;
            ++ans;
            doCung = Math.min(doCung - 1, a[i]);
        }
        System.out.println(ans);
        scn.close();
    }
}

/*
 * 5
 * 3 3 3 3 3
 * 5
 * 1 2 3 4 5
 * 5
 * 1 1 1 3 4
 * 6
 * 1 1 1 1 2 6
 * 
 * 
 * 
 */
