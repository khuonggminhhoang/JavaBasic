import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_cac_tu_trong_xau {
    public static boolean symmetricString(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arrStrings = s.split("\\s+");
        Arrays.sort(arrStrings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            } 
        });
        for(String x : arrStrings){
            if(symmetricString(x)){
                System.out.print(x + " ");
            }
        }
    }
}
