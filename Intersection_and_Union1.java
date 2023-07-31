import java.util.Scanner;
import java.util.TreeSet;

public class Intersection_and_Union1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        TreeSet <Integer> set1 = new TreeSet<>(),
                          set2 = new TreeSet<>(),
                          Uni = new TreeSet<>();
        
        while(n-- > 0){
            Integer x = scn.nextInt();
            set1.add(x);
            Uni.add(x);
        }
        while(m-- > 0){
            Integer x = scn.nextInt();
            set2.add(x);
            Uni.add(x);
        }
        for(Integer x : Uni){
            System.out.print(x + " ");
        }
        System.out.println();
        for(Integer x : set1){
            if(set2.contains(x)){
                System.out.print(x + " ");
            }
        }
        
    }
}
