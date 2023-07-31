import java.util.*;

public class Symmetric_difference {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>(),
                         set2 = new TreeSet<>(),
                         resSet = new TreeSet<>();
        int n = scn.nextInt(), 
            m = scn.nextInt();
        while(n-- > 0){
            Integer x = scn.nextInt();
            set1.add(x);
        }
        while(m-- > 0){
            Integer x = scn.nextInt();
            set2.add(x);
        }
        for(Integer x : set1){
            if(!set2.contains(x)) resSet.add(x);
        }
        for(Integer x : set2){
            if(!set1.contains(x)) resSet.add(x);
        }
        for(Integer x : resSet) System.out.print(x + " ");
        scn.close();
    }
}
