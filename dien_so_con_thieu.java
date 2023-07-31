import java.util.Arrays;
import java.util.Scanner;

public class dien_so_con_thieu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a);
        int min = a[0], max = a[n-1];
        int ans = 0;
        for(int i=min; i<= max; ++i){
            if(Arrays.binarySearch(a,i) < 0) ans++;
        }
        System.out.println(ans);
        scn.close();
    }
}
