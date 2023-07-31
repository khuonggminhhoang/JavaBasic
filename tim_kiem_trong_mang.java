import java.util.Arrays;
import java.util.Scanner;

public class tim_kiem_trong_mang {
    public static boolean binarySearch(Integer a[], int n, int x){
        int left = 0, right = n-1;
        while(left <= right){
            int mid = (left + right)/2;
            if( a[mid] < x) left = mid + 1;
            else if( a[mid] > x) right = mid - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),
            x = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i= 0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        System.out.println(binarySearch(a,n,x));
    }
}
