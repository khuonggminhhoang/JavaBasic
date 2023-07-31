import java.util.Scanner;

public class to_hop_chap_k_cua_n {
    public static long toHop(int n, int k){
        long res = 1;
        k = Math.min(k,n-k);
        for(int i=1; i<=k; ++i){
            res *= (n-i+1);
            res /= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k,n;
        n = scn.nextInt();
        k = scn.nextInt();
        System.out.println(toHop(n, k));
    }
}
