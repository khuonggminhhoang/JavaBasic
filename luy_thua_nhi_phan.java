import java.util.Scanner;

public class luy_thua_nhi_phan {

    //binary exponentation
    public static long pow(long a, long b){
        long res = 1;
        while(b!=0){
            if(b%2 == 1){
                res *= a;
                res %= 1000000007;
            }
            b /= 2;  // bản chất nó là phép dịch bit sang  
            a *= a;
            a %= 1000000007;
        }
        return res;
    }

    public static long binPow(long a , long b){
        if(b == 0) return 1;
        long tmp = binPow(a, b/2);
        if(b%2 ==1 ) 
            return tmp * tmp *a;
        else 
            return tmp * tmp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a,b;
        a = scn.nextLong();
        b = scn.nextLong();
        System.out.println(pow(a,b));
    }
}
