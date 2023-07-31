import java.util.Scanner;

public class mua_nuoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a,b;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        if( a > 1d*b/2){
            int ans = (n/2)*b + (n%2)*a;
            System.out.println(ans);
        }
        else System.out.println(n*a);
    }
}
