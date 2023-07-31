import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class xau_con_lien_tiep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = "";
        ans+=s.charAt(0);
        for(int i=1; i<s.length(); ++i){
            if(s.charAt(i-1) != s.charAt(i)){
                ans += " " + s.charAt(i);
            }
            else{
                ans += s.charAt(i);
            }
        }
        String[] arr = ans.split("\\s+");
        Arrays.sort(arr, new Comparator <String> (){

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o2.length() - o1.length();
                }
                else {
                    return o2.compareTo(o1);
                }
            }
            
        });

        System.out.println(arr[0]);
    }
}
