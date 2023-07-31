import java.util.Scanner;

public class so_nhi_phan_chia_het_cho_5 {
    public static boolean check(String s){
        int r = 0;
        for(char x : s.toCharArray()){
            r = (2*r + (x - '0')) % 5;
        }
        return r == 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(check(s) ? "YES" : "NO");
    }
}
