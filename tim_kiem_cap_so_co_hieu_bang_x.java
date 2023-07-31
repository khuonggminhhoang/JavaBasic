import java.util.Arrays;
import java.util.Scanner;

public class tim_kiem_cap_so_co_hieu_bang_x {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int x = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a);
        int ok = -1;
        for(int i=0; i<n-1; ++i){
            if(Arrays.binarySearch(a, i+1, n, x + a[i]) >=0) {
                ok = 1;
                break;
            }
        }
        System.out.println(ok);
    }
}
