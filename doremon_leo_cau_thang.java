import java.util.Scanner;

public class doremon_leo_cau_thang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,m, ans = -1;
        n = scn.nextInt();
        m = scn.nextInt();
        int minStep , maxStep  = n;
        minStep = (n%2==0)? n/2 : n/2 +1;
        if(minStep % m == 0){
            ans = minStep;
        }
        else{
            ans = (minStep/m + 1) * m;
        }
        System.out.println(ans);
    }
}
