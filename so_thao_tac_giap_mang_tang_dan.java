import java.util.*;

public class so_thao_tac_giap_mang_tang_dan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        int ans = 0;
        for(int i=1; i<n; ++i){
            if(a[i] <= a[i-1]){
                ans += a[i-1] + 1 - a[i];
                a[i] = a[i-1] + 1;
            }
        }
        System.out.println(ans);
    }
}
