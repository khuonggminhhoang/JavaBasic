import java.util.*;

public class in_ra_so_nguyen {
    public static void numRecursive_1(long n){
        if(n < 10) {
            System.out.print(n + " ");
            return;
        }
        numRecursive_1(n/10);
        System.out.print(n%10 + " ");
    }

    public static void numRecursive_2(long n){
        if(n < 10) {
            System.out.println(n);
            return;
        }
        System.out.print(n%10 + " ");
        numRecursive_1(n/10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        numRecursive_1(n);
        System.out.println();
        numRecursive_2(n);
    }
}
