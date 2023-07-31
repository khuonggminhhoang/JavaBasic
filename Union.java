import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Union {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int  n = scn.nextInt(), m = scn.nextInt();
        for(int i = 0; i < n + m; ++i){
            Integer x = scn.nextInt();
            set.add(x);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer x : set){
            arr.add(x);
        }
        Collections.reverse(arr);
        for(Integer x : arr){
            System.out.print(x + " ");
        }
        scn.close();
    }
}
