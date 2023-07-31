import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_cac_tu_trong_xau_1 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split("\\s+");
        Arrays.sort(arr);
        for(String x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(arr, new Comparator <String>(){

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                else{
                    return o1.compareTo(o2);
                }
            }
        });
        for(String x : arr){
            System.out.print( x + " ");
        }
    }
}
