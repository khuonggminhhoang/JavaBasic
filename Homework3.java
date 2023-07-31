import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        for(int i=10; i<=n; ++i){
            if(i%3 == 0){
                System.out.print(i + " ");
            }
        }    
    }    
}
