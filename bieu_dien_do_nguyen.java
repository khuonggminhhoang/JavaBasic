import java.util.Scanner;

public class bieu_dien_do_nguyen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n>1){
            if(n%2==0){
                System.out.println(n/2);
                for(int i=0; i<n/2; ++i){
                    System.out.print(2 + " ");
                }
                System.out.println();
            }
            else {
                int tmp = n/2 - 1;
                for(int i=0; i<tmp; ++i){
                    System.out.print(2 + " ");
                }
                System.out.println(3);
            }
        }
        else System.out.println(-1);
    }
}
