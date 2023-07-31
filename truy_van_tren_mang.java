import java.util.ArrayList;
import java.util.Scanner;

public class truy_van_tren_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=0; i<n; ++i) {
            int x = scn.nextInt();
            arr.add(x);
        }
        int q = scn.nextInt();
        while(q-- > 0){
            int query = scn.nextInt();
            Integer ele = scn.nextInt();
            switch (query) {
                case 1 : arr.add(ele); break;
                case 2 : arr.remove(ele); break;
                case 3 : System.out.println((arr.contains(ele)) ? "YES" : "NO");
            }
        }
        scn.close();
    }
}
