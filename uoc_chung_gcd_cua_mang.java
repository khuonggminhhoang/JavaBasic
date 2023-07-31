import java.util.Scanner;

public class uoc_chung_gcd_cua_mang {
    public static int gcd(int a, int b){
        while(b!=0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        int ans =0;
        for(int i=0; i<n; ++i){
            ans = gcd(a[i], ans);
        }
        System.out.println(ans);

    }
}
