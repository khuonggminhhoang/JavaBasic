import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        long sum  = 0;

        for(int i= 1; i<=n; ++i){
            if(i == 3) continue;
            if(i%2==1){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
