import java.util.*;

public class dem_so_thao_tac {
    public static int counting(int n){
        if(n == 1) return 0;
        int ans1 = (int) 1e9, ans2 = (int) 1e9, ans3 = (int) 1e9;
        if(n%3 == 0) ans1 = 1 + counting(n/3);
        if(n%2 == 0) ans2 = 1 + counting(n/2);
        ans3 = 1 + counting(n-1);
        return Math.min(ans1, Math.min(ans2, ans3));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(counting(n));
    }
}
