import java.util.*;

public class chia_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), k = scn.nextInt();
        int[] a = new int[n];
        long sumArr = 0;
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
            sumArr += a[i];
        }
        Arrays.sort(a);
        long sum = 0;
        for(int i=0; i<k; ++i){
            sum+=a[i];
        }
        System.out.println(sumArr - sum - sum);
    }
}
