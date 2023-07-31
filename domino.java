import java.util.Scanner;

public class domino {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        long res = (m/2)*n + (m%2)*(n/2); // res = n*m/2;
        System.out.println(res);
    }
}
