import java.util.*;

public class dinh_ly_pytagp {
    public static boolean searchPytago(long[] a, int n){
        for(int k = n-1; k>=2; --k){
            int l = 0, r = n-1;
            while(l < r){
                if(a[l] + a[r] < a[k]){
                    l++;
                }
                else if(a[l] + a[r] > a[k]){
                    --r;
                }
                else return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n;++i){
            int x = scn.nextInt();
            a[i] = x*x;
        }
        Arrays.sort(a);
        System.out.println((searchPytago(a,n)) ? "YES" : "NO");
        scn.close();
    }
}
