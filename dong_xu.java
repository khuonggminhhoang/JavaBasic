import java.util.Scanner;

public class dong_xu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n, s, res;
        n = scn.nextInt();
        s = scn.nextInt();
        res = (s%n == 0) ? s/n : s/n + 1;
        System.out.println(res);  
    }
}