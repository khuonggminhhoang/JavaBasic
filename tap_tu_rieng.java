import java.util.TreeSet;
import java.util.Scanner;

public class tap_tu_rieng {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String[] arr1 = s1.split("\\s+");
        String[] arr2 = s2.split("\\s+");
        TreeSet <String> set1 = new TreeSet<>();
        TreeSet <String> set2 = new TreeSet<>();
        for(String x : arr1){
            set1.add(x);
        }
        for(String x : arr2){
            set2.add(x);
        }
        for(String x : set1){
            if(!set2.contains(x)){
                System.out.print(x + " ");
            }
        }
    }
}
