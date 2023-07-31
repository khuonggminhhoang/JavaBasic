import java.util.Scanner;

public class tinh_tong_1 {
    public static int Sum(int n){
        if(n == 1) return 1;
        return n + Sum(n-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(Sum(n));
    }
}
