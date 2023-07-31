import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class phan_tu_phan_biet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet <Integer> hSet = new HashSet<>();
        while(n-->0){
            int x = scn.nextInt();
            hSet.add(x);
        }
        System.out.println(hSet.size());
    }
}
