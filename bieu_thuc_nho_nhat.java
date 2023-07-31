import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bieu_thuc_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        Integer[] a = new Integer[n-1];
        long ans = scn.nextLong();
        int cntSig = 0;

        for(int i=0; i<n-1; ++i){
            a[i] = scn.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        
        for(int i=0; i<n-1; ++i){
            if(cntSig < k){
                ans += a[i];
                ++cntSig;
            }
            else ans -= a[i];
        }
        System.out.println(ans);
    }
}
