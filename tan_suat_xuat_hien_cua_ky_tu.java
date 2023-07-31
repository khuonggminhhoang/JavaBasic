import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tan_suat_xuat_hien_cua_ky_tu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        TreeMap <Character, Integer> map1 = new TreeMap<>();
        LinkedHashMap <Character, Integer> map2 = new LinkedHashMap<>();

        for(char x : s.toCharArray()){
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

        Set < Map.Entry<Character, Integer>> entry1 = map1.entrySet(),
                                             entry2 = map2.entrySet();
        for(Map.Entry<Character, Integer> mp : entry1){
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
        System.out.println();
        for(Map.Entry<Character, Integer> mp : entry2){
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
    }
}
