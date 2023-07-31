import java.util.HashSet;
import java.util.Scanner;

public class truy_van_phan_tu_trong_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while(n-- > 0){
            int x = scn.nextInt();
            set.add(x);
        }
        int q = scn.nextInt();
        while(q-- > 0){
            int x = scn.nextInt();
            if(set.contains(x)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
