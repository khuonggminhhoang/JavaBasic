import java.util.Scanner;

public class so_chinh_phuong {
    public static boolean checkScp(int a){
        int tmp = (int) Math.sqrt(a);
        if(tmp * tmp == a) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(checkScp(n)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
