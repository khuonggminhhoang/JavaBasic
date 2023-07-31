import java.util.Scanner;

public class so_dep2 {
    public static boolean stn(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().compareTo(s) == 0;
    }

    public static boolean check(String s){
        if(stn(s)){
            for(char x : s.toCharArray()){
                if(x == '6') return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(check(s) ? "YES" : "NO");
    }
}
