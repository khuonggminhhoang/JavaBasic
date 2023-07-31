import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i<= Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            System.out.println((check(n)==true) ? "YES":"NO");
        }
    }
}
