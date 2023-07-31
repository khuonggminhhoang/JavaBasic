import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class vat_sua_bo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        long ans = 0;
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0; i<n; ++i){
            if(a[i] - i <= 0) break;
            ans += a[i] - i;
        }
        System.out.println(ans);
    }
}
