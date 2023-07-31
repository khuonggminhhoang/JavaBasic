import java.util.Scanner;

public class kiem_tra_nhieu_test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int i = 0;
        while(i<t){
            int x = scn.nextInt();
            if(x%2==0) System.out.println("EVEN");
            else System.out.println("ODD");
            i++;
        }

    }
}
