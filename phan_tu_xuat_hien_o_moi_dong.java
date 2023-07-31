import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class phan_tu_xuat_hien_o_moi_dong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer n = scn.nextInt();
        TreeMap <Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n; ++i){
            Integer x = scn.nextInt();
            map.put(x,0);
        }
        for(int i=1; i<n; ++i){
            for(int j = 0; j<n; ++j){
                Integer x = scn.nextInt();
                if(map.containsKey(x) && map.get(x) == i-1){
                    map.put(x,i);
                }
            }
        }
        Set <Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        int ok = 1;
        for( Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() == n-1){
                System.out.print(entry.getKey() + " ");
                ok = 0;
            }
        }
        if(ok == 1) System.out.println("NOT FOUND");
        scn.close();
    }
}
/*
5
0 1 4 0 4 
3 2 2 3 0 
0 3 4 0 1 
0 1 4 4 1 
0 0 0 0 2 
 
 */