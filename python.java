import java.util.Scanner;

public class python {
    public static boolean check(String s){
        String target = "python";
        int i = 0;
        for(char x : s.toCharArray()){
            if(x == target.charAt(i)){
                ++i;
                if(i == target.length()){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println((check(s)) ? "YES" : "NO");
        
    }
}
