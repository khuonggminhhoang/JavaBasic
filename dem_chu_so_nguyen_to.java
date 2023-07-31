import java.util.Scanner;

public class dem_chu_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int cnt = 0;
        while(n!=0){
            long x =  n%10;
            if( x == 2 || x == 3 || x == 5 || x == 7){
                cnt++;
            }
            n/=10;
        }
        System.out.println(cnt);
    }
}
