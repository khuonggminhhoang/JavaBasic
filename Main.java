import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GiaoVien a= new GiaoVien(scn.nextLine(), scn.nextLine(), scn.nextInt());
        System.out.println(a.toString());
    }
}
