import java.util.HashMap;
import java.util.Scanner;

public class dem_prime_tren_2_duong_cheo {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        HashMap<Integer, Integer> map = new HashMap<>();
         
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        int cnt = 0;
        for(int i=0; i<n; ++i){
            if( !map.containsKey(a[i][i]) && isPrime(a[i][i])){
                cnt++;
                map.put(a[i][i],1);
            }
            if( !map.containsKey(a[i][n-1-i]) && isPrime(a[i][n-1-i])){
                cnt++;
                map.put(a[i][n-1-i],1);
            }
        }
        System.out.println(cnt);

    }
}
