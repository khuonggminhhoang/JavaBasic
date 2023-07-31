import java.util.HashSet;
import java.util.Scanner;

public class cac_so_khac_nhau_trong_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet <Integer> set = new HashSet<>();
        while(n-- > 0){
            Integer x = scn.nextInt();
            set.add(x);
        }
        System.out.println(set.size());
    }
}
/*

10
2 2 2 1 3 2 5 1 4 2

 */