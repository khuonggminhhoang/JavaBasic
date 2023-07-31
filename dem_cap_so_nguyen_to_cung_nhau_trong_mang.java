import java.util.Scanner;

public class dem_cap_so_nguyen_to_cung_nhau_trong_mang {
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
        int cnt = 0;
        for(int i=0; i<n-1; ++i){
            for(int j=i+1; j<n; ++j){
                if(gcd(a[i], a[j]) == 1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
