import java.util.Scanner;

public class ghep_so {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k2,k3,k5,k6;
        k2 = scn.nextInt();
        k3 = scn.nextInt();
        k5 = scn.nextInt();
        k6 = scn.nextInt();
        int tmp1 = Math.min(Math.min(k2,k5),k6);
        k2-=tmp1;
        int tmp2 = Math.min(k2,k3);
        System.out.println(1l*tmp1*256 + 1l*tmp2*32);
    }
}
