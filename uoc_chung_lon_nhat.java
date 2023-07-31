import java.util.Scanner;

public class uoc_chung_lon_nhat {
    public static int GCD(int a, int b){
        while(b!=0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        a = scn.nextInt();
        b= scn.nextInt();
        System.out.println(GCD(a,b));
    }
}
