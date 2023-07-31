import java.util.*;

public class maximum_pair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a);
        int ans = Math.abs(a[0] + a[1]);
        System.out.println(Math.max(ans, Math.abs(a[n-1] + a[n-2])));
    }
}
