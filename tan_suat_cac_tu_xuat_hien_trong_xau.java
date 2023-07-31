import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tan_suat_cac_tu_xuat_hien_trong_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split("\\s+");
        TreeMap <String, Integer> map1 = new TreeMap<>();
        LinkedHashMap <String, Integer> map2 = new LinkedHashMap<>();
        for(String x : arr){
            if(!map1.containsKey(x)){
                map1.put(x,1);
            }
            else{
                int tmp = map1.get(x);
                ++tmp;
                map1.put(x,tmp);
            }
            if(!map2.containsKey(x)){
                map2.put(x,1);
            }
            else{
                int tmp = map2.get(x);
                ++tmp;
                map2.put(x,tmp);
            }
        }
        Set <Map.Entry<String, Integer>> entrySet1 = map1.entrySet();
        for(Map.Entry<String, Integer> mp : entrySet1){
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
        System.out.println();
        entrySet1.clear();
        entrySet1 = map2.entrySet();
        for(Map.Entry<String, Integer> mp : entrySet1){
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
    }
}
