import java.util.Scanner;
import java.util.TreeSet;

public class ky_tu_xuat_hien_o_ca_hai_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        TreeSet <Character> set1 = new TreeSet<>();
        TreeSet <Character> set2 = new TreeSet<>();
        TreeSet <Character> set3 = new TreeSet<>();
        for(char x : s1.toCharArray()){
            set1.add(x);
            set3.add(x);
        }
        for(char x : s2.toCharArray()){
            set2.add(x);
            set3.add(x);
        }
        for(char x : set1){
            if(set2.contains(x)){
                System.out.print(x);
            }
        }
        System.out.println();
        for(char x : set3){
            System.out.print(x);
        }
    }
}
