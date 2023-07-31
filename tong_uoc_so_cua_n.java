import java.util.Scanner;

public class tong_uoc_so_cua_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long sum = 0;
        for(int i=1; i<=Math.sqrt(n); ++i){
            if(n%i==0){
                sum+=i+n/i;
            }
        }
        if( Math.sqrt(n) == (long)Math.sqrt(n)) sum+=(long)Math.sqrt(n);
        System.out.println(sum);
        
    }
}
