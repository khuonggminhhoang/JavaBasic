import java.util.Scanner;

public class cua_so_co_k {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),
            k = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i) a[i] = scn.nextInt();

        int sum = 0;
        for(int j = 0 ; j<k; ++j){
            sum += a[j];
        }
        System.out.print(sum + " ");
        for(int i=1; i<=n - k; ++i){
            sum = sum - a[i-1] + a[i + k - 1];
            System.out.print(sum + " ");
        }
    }
}
