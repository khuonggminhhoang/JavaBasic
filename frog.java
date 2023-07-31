import java.util.Scanner;

public class frog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,k;
        a = scn.nextInt();
        b = scn.nextInt();
        k = scn.nextInt();
        long  res = 0;
        if( k % 2 == 0){
            res = k/2 * a - k/2 * b; 
        }
        else {
            res = k/2 * a - k/2 * b + a; 
        }
        System.out.println(res);
    }
}
