import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class liet_ke_cac_tu_khac_nhau_trong_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split("\\s+");
        Set <String> set1 = new TreeSet<>();
        Set <String> set2 = new LinkedHashSet<>();
        for(String x : arr){
            set1.add(x);
            set2.add(x);
        }
        for(String x : set1){
            System.out.print(x + " ");
        }
        System.out.println();
        for(String x : set2){
            System.out.print(x + " ");
        }
    }
}
