import java.util.Scanner;

public class tinh_tong_chu_so_chan_le {
    public static long tongChan(long n){
        if(n < 10) {
            if(n%2 == 0) return n;
            return 0;
        }
        if(n%10 %2 == 0){
            return n%10 + tongChan(n/10);
        }
        return tongChan(n/10);
    }

    public static long tongLe(long n){
        if(n < 10) {
            if(n%2 == 1) return n;
            return 0;
        }
        if(n%10%2 == 1) return n%10 + tongLe(n/10);
        return tongLe(n/10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(tongChan(n));
        System.out.println(tongLe(n));
    }
}
