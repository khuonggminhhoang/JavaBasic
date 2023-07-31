import java.util.Scanner;

public class mua_bia {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = (int) Math.floor(n*1.0/28);
        int tmp = ans;
        while(tmp>=3){
            tmp-=2;
            ans++;
        }
        System.out.println(ans);
    }
}
