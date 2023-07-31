import java.util.*;

public class kiem_tra_chu_so_chan {
    public static boolean check(long n){
        if(n < 10) return n%2 == 0;
        if(n%10 % 2 == 0) return check(n/10);
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(check(n));
    }
}
