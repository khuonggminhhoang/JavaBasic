import java.util.Scanner;

public class so_loc_phat {
    public static boolean check(long n){
        while(n!=0){
            if(n%10 != 6 && n%10 != 8) return false;
            n/=10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        System.out.println((check(n)) ? "YES" : "NO");
    }
}
