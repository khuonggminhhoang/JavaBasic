import java.util.Scanner;

public class tinh_tong_va_tich_cac_phan_tu_trong_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int mod = (int) 1e9 + 7;
        long sum = 0, mul = 1;

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        for(int i=0; i<n; ++i){
            sum += a[i];
            sum %= mod;
            mul *= a[i];
            mul %= mod;
        }
        System.out.println(sum + " " + mul);
    }
}
