import java.util.Scanner;

public class doi_tien {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), res;
        res = n/100;
        n%=100;
        res += n/20;
        n%=20;
        res += n/10;
        n%=10;
        res += n/5;
        n%=5;
        res += n;
        System.out.println(res);
    }
}
