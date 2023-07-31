import java.util.Scanner;

public class cap_so_nguyen_to_cung_nhau {
    public static int gcd(int a, int b){
        while(b != 0){
            int tmp = a%b;
            a = b; 
            b = tmp;
        }
        return a;
    }

    public static void solve(int a, int b){
        for(int i=a; i< b; ++i){
            for(int j=i+1; j<=b; ++j){
                if(gcd(i,j) == 1) System.out.println("(" + i + "," + j + ")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        a = scn.nextInt();
        b = scn.nextInt();
        solve(a, b);
    }
}
