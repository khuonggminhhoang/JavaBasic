import java.util.Arrays;
import java.util.Scanner;

public class hop_va_giao_cua_hai_mang {
    public static int cleanArr(int[] a , int n){
        for(int i=0; i< n - 1; ++i){
            if(a[i] == a[i + 1]){
                for(int j = i+1; j<n-1; ++j){
                    a[j] = a[j+1];
                }
                --i;
                --n;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        for(int i=0; i<m; ++i){
            b[i] = scn.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        n = cleanArr(a, n);
        m = cleanArr(b, m);

        for(int i = 0; i<n; ++i){
            if(Arrays.binarySearch(b,a[i]) >= 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        int[] uni = new int[m+n];
        for(int i=0; i<n + m; ++i){
            if(i < n) uni[i] = a[i];
            else uni[i] = b[i-n];
        }
        
        Arrays.sort(uni);
        int sz = cleanArr(uni, n+m);
        for(int i=0; i<sz; ++i) System.out.print(uni[i] + " ");
        scn.close();
    }
}
