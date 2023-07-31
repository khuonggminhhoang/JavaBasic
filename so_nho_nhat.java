import java.util.*;

public class so_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1, minElement = Integer.MAX_VALUE;
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        for(int x :a){
            if(x < minElement){
                ans = 1;
                minElement = x;
            }
            else if(x == minElement) ++ans;
        }
        System.out.println(ans);
    }
}
