import java.util.Scanner;
import java.util.HashSet;

public class xau_pangram1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int[] a = new int[256];
        StringBuilder sb = new StringBuilder("");
        for(char x : s.toCharArray()){
            if(Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            }
            else sb.append(x);
        }
        s = sb.toString();
        HashSet <Character> set = new HashSet<>();
        for(char x : s.toCharArray()){
            set.add(x);
        }
        if(set.size() == 26) System.out.println("YES");
        else System.out.println("NO");

    }
}
