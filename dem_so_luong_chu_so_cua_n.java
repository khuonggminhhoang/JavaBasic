import java.util.Scanner;

public class dem_so_luong_chu_so_cua_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        int cnt = 0;
        if(n==0) cnt = 1;
        while(n!=0){
            ++cnt;
            n/=10;
        }
        System.out.println(cnt);
    }
}