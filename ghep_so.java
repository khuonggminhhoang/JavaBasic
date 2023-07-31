import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ghep_so {
    public static void solve(String s){
        s  = s + "a";
        String tmp = "";
        ArrayList <String> list = new ArrayList<>();
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                tmp+=x;
            }
            else if(tmp != ""){
                while(tmp.charAt(0) == '0' && tmp.length() != 1 ){
                    tmp = tmp.substring(1);
                }
                list.add(tmp);
                tmp = "";
            }
        }
        Collections.sort(list, Comparator.reverseOrder());
        for(String x : list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        solve(s);

    }
}
