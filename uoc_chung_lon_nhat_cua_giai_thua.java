import java.util.Scanner;

public class uoc_chung_lon_nhat_cua_giai_thua {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a,b;
        a = scn.nextLong();
        b = scn.nextLong();
        long tmp = Math.min(a,b);
        long res = 1;
        for(int i=1; i<= tmp; ++i){
            res *= i;
        }
        System.out.println(res);
    }
}
