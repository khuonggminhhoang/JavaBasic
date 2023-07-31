import java.util.Scanner;

public class so_thuan_nghich {
    public static boolean check(int n){
        int tmp = n, rev = 0;
        while(tmp != 0){
            rev = rev*10 + tmp%10;
            tmp /= 10;
        }
        if(rev == n) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println((check(n)==true) ? "YES" : "NO");
    }
}
