import java.util.*;

public class Suffix_and_query {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        HashSet <Integer> set = new HashSet<>();
        int[] F = new int[n];
        for(int i  = n -1; i>=0; --i){
            set.add(a[i]);
            F[i] = set.size();
        }
        int q = scn.nextInt();
        while(q-- > 0 ) {
            int x = scn.nextInt();
            System.out.println(F[x]);
        }
    }
}
