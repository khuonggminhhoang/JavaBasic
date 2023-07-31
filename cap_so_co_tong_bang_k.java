import java.util.Scanner;
import java.util.Arrays;

public class cap_so_co_tong_bang_k {
    public static int fisrt(int[] a, int j ,int n, int x){
        int mid, left = j+1 , right = n-1;
        int ans = -1;
        while(left <= right){
            mid = (left + right)/2;
            if(a[mid] == x) {
                right = mid -1;
                ans = mid;
            }
            else if(a[mid] < x){
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
        return ans;
    }

    public static int last(int[] a, int j , int n, int x){
        int mid, left = j+1 , right = n-1;
        int ans = -1;
        while(left <= right){
            mid = (left + right)/2;
            if(a[mid] == x) {
                left = mid +1;
                ans = mid;
            }
            else if(a[mid] < x){
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
        long cnt = 0;
        for(int i=0; i<n-1; ++i){
            int x1 = fisrt(a,i,n,k -a[i]);
            int x2 = last(a,i,n,k-a[i]);
            if(x1 != -1 && x2 != -1) {
                cnt += (x2 - x1 + 1); 
            }
        }
        System.out.println(cnt);
    }
}
