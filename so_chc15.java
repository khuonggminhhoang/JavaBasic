import java.util.Scanner;

public class so_chc15 {
    public static int Sum(String s){
        int sum = 0;
        for(char x : s.toCharArray()){
            sum += x - '0';
        }
        return sum;
    }

    public static boolean check(String s){
        if(s.charAt(s.length() - 1) != '0' &&  s.charAt(s.length() - 1) != '5') return false;
        if(Sum(s) % 3 != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(check(s) ? "YES" : "NO");
    }
}
