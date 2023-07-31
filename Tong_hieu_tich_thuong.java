import java.util.Scanner;

public class Tong_hieu_tich_thuong {

    public static long sum(int a, int b){
        return (long) a + b;
    }

    public static long sub(int a, int b){
        return (long) a - b;
    }

    public static long mul(int a, int b){
        return (long) a * b;
    }

    public static double div(int a, int b){
        return (double) a/b;
    }

    public static void solve(int a, int b){
        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        if(b==0) System.out.println("INVALID");
        else System.out.printf("%.4f\n",div(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        solve(a,b);
    }
}
