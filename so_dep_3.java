import java.util.Scanner;

public class so_dep_3 {
    public static boolean increaseNum(String s){
        for(int i=1; i<s.length(); ++i){
            if(s.charAt(i - 1) > s.charAt(i)) return false;
        }
        return true;
    }

    public static boolean decreaseNum(String s){
        for(int i=1; i<s.length(); ++i){
            if(s.charAt(i - 1) < s.charAt(i)) return false;
        }
        return true;
    }    

    public static boolean check(String s){
        if(decreaseNum(s) || increaseNum(s)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(check(s) ? "YES" : "NO");
    }
}
