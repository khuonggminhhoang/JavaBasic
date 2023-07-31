import java.util.Scanner;
import java.util.Arrays;

public class acm_icpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        int ans = 1;
        Arrays.sort(a);
        for(int i=1; i<n; ++i){
            if(a[i] - a[i-1] > k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
