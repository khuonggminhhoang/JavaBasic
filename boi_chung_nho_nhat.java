import java.util.Scanner;

public class boi_chung_nho_nhat {
    public static int gcd(int a, int b){
        while(b!=0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        a= scn.nextInt();
        b= scn.nextInt();
        System.out.println(lcm(a,b));
    }
}
