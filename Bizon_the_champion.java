import java.util.Scanner;

public class Bizon_the_champion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1,a2,a3,b1,b2,b3,n;
        a1 = scn.nextInt();
        a2 = scn.nextInt();
        a3 = scn.nextInt();
        b1 = scn.nextInt();
        b2 = scn.nextInt();
        b3 = scn.nextInt();
        n = scn.nextInt();
        int cup = a1 + a2 + a3;
        int medal = b1 + b2 + b3;
        int sum1 = (cup%5==0)? cup/5 : cup/5 + 1;
        int sum2 = ( medal%10==0) ? medal/10 : medal/10 + 1 ;
        System.out.println((sum1 + sum2 <= n)?"YES" : "NO");
    }
}
