import java.util.Scanner;

public class mang_danh_dau_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] t = new int[1000001];
        int cnt = 0;
        for(int i=0; i<n; ++i) {
            a[i] = scn.nextInt();
            t[a[i]] = 1;
        }
        for(int x : t){
            if(x == 1) cnt++;
        }
        System.out.println(cnt);
    }
}
