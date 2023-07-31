import java.util.Scanner;

public class mang_doi_xung {
    public static boolean check(int[] a, int n){
        for(int i=0; i< n/2; ++i){
            if( a[i] != a[n-i-1] ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n;++i) a[i] = scn.nextInt();
        System.out.println( (check(a, n)) ? "YES" : "NO");
    }
}
