import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class so_xuat_hien_nhieu_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        int num = a[0], ans = (int) -1e9, times = 1;

        Arrays.sort(a);

        for(int i=0; i<n-1; ++i){
            if(a[i] == a[i+1]){
                ++times;
            }
            else{
                if(times > ans){
                    ans = times;
                    num = a[i];
                }
                times = 1;
            }
        }
        if(times > ans){
            ans = times;
            num = a[n-1];
        }
        System.out.println(num + " " + ans);
    }
}
