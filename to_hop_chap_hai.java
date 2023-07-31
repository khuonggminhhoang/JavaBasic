import java.util.Scanner;

public class to_hop_chap_hai {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        long res = 1l * n*(n-1)/2;
        System.out.println(res);
    }
}
