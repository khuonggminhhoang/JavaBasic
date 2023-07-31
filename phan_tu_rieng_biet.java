import java.util.LinkedHashSet;
import java.util.Scanner;

public class phan_tu_rieng_biet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        int n = scn.nextInt();
        while(n-- > 0){
            int x = scn.nextInt();
            set.add(x);
        }
        for(Object x : set ){
            System.out.print(x + " ");
        }
    }
}
