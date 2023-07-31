import java.util.*;

public class cap_so_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        int k = scn.nextInt();
        for(int i=0; i<n-1; ++i){
            for(int j = i+1; j<n; ++j){
                if(a[i] + a[j] == k) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
