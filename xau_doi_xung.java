import java.util.Scanner;

public class xau_doi_xung {
    public static boolean check(String s){
        for(int i=0; i<s.length()/2; ++i){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println((check(s)) ? "YES" : "NO");
    }
}
