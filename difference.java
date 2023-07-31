import java.util.*;

public class difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TreeSet<Integer> s1 = new TreeSet<>(),
                         s2 = new TreeSet<>();
        int n = scn.nextInt(), m = scn.nextInt();
        while(n-- > 0){
            Integer x = scn.nextInt();
            s1.add(x);
        }
        while(m-- > 0){
            Integer x = scn.nextInt();
            s2.add(x);
        }
        for(Integer x : s1){
            if(!s2.contains(x)){
                System.out.print(x + " ");
            }
        }
    }
}
