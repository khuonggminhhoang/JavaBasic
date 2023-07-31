import java.util.Scanner;
import java.util.Arrays;

public class khoang_cach_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int ans = Integer.MAX_VALUE;

        for(int i =0; i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a);
        for(int i=1; i<n; ++i){
            ans = Math.min(ans, a[i] - a[i-1]);
        }
        System.out.println(ans);
    }
}
