import java.util.Scanner;

public class so_thuan_nghich_trong_tam_giac_duoi {
    public static boolean check(int n){
        int tmp = n;
        int num = 0;
        while(tmp != 0){
            num = num * 10 + tmp%10;
            tmp/=10;
        }
        return n == num;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i)
            for(int j=0; j<n; ++j)
                a[i][j] = scn.nextInt();
        int cnt = 0;
        for(int i=0; i<n; ++i){
            for(int j = 0; j<=i; ++j){
                if(check(a[i][j])) cnt++;
            }
        }
        System.out.println(cnt);
        scn.close();
    }
}
