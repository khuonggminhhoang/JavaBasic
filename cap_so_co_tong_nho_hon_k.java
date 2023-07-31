import java.util.Arrays;
import java.util.Scanner;

public class cap_so_co_tong_nho_hon_k {
    public static int bynarySearch(int[] a , int n, int j, int x){
        int left = j, right = n-1;
        int ans = -1;

        while(left <= right){
            int mid = (left+right)/2;
            if(a[mid] < x){
                ans = mid;
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a);
        long cnt =0;
        for(int i=0; i<n-1; ++i){
            int x1 = bynarySearch(a, n, i+1 , k - a[i]);
            if(x1 != -1){
                cnt += (x1 - i);
            }
        }
        System.out.println(cnt);
        scn.close();
    }
}
