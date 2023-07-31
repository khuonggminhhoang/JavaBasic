import java.util.Scanner;

public class so_dau_tien_cua_so_nguyen1 {
    public static int solve(int n){
        if(n < 10 ) return n;
        return solve(n/10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solve(n));
    }
}
