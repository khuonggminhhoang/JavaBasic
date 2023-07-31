import java.util.Scanner;

public class kiem_tra_xau_con {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        System.out.println(s1.contains(s2) ? "YES" : "NO");
    }
}
