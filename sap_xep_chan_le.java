import java.util.Arrays;
import java.util.Scanner;

public class sap_xep_chan_le {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n],
              ans = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        Arrays.sort(a);
        int l = 0, r = n-1;
        for(int i= n-1; i>=0; --i){
            if(a[i]%2 == 0){
                ans[r] = a[i];
                --r;
            }
            else{
                ans[l] = a[i];
                ++l;
            }
        }
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
