import java.util.Scanner;

public class su_hao_phong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c1, c2, c3, c4 ,c5, b;
        c1 = scn.nextInt();
        c2 = scn.nextInt();
        c3 = scn.nextInt();
        c4 = scn.nextInt();
        c5 = scn.nextInt();
        b = c1 + c2 + c3 + c4 + c5;
        if(b>0 && b%5 == 0){
            System.out.println(b/5);
        }
        else System.out.println(-1);
    }
}
