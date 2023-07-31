import java.util.Scanner;
import java.util.Arrays;

public class tm_kiem_nhi_phan {
    public static boolean binary_Search(int[] a,int n, int x){
        int left = 0, right = n-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(a[mid] == x) return true;
            else if( a[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        } 
        Arrays.sort(a);
        int q = scn.nextInt();
        while(q-- > 0){
            int x = scn.nextInt();
            if(binary_Search(a,n,x)) System.out.println("YES");
            else System.out.println("NO");
        }
        scn.close();
    }
}
