import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class phan_tu_xuat_hien_o_moi_hang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TreeMap <Integer, Integer> map = new TreeMap<>();
        int n = scn.nextInt();
        for(int  i=0; i<n; ++i){
            Integer x = scn.nextInt();
            map.put(x,0);
        }

        for(int i=1; i< n; ++i){
            for(int j=0; j<n; ++j){
                Integer x = scn.nextInt();
                if(map.containsKey(x) && map.get(x) == i-1){
                    map.put(x,i);
                }
            }
        }
        int ok = 0;
        Set <Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue() == n-1){
                System.out.print(entry.getKey() + " ");
                ok = 1;
            }
        }
        if(ok == 0) System.out.println("NOT FOUND");
        scn.close();
    }
}
