import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ghep_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String[] a = new String[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.next();
        }
        Arrays.sort(a, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);  // o1 > o2 return > 0
            }
        });
        String ans = "";
        for(String x : a){
            ans += x;
        }
        System.out.println(ans);
    }
}
