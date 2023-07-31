import java.util.*;

public class so_bi_lap_dau_tien {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet <Integer> set = new HashSet<>();
        int ok = 0;
        while(n-- > 0){
            int x = scn.nextInt();
            if(set.contains(x)){
                System.out.println(x);
                ok = 1;
                break;
            }
            else{
                set.add(x);
            }
        }
        if(ok == 0) System.out.println("-1");
    }
}
