import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class dem_tan_suat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        TreeMap <Integer, Integer> map1 = new TreeMap<>();
        LinkedHashMap <Integer, Integer> map2 = new LinkedHashMap<>();
        for(int i=0;i<n; ++i){
            if(!map1.containsKey(a[i])){
                map1.put(a[i],1);
            }
            else{
                int tmp = map1.get(a[i]);
                tmp++;
                map1.put(a[i], tmp);
            }
            if(!map2.containsKey(a[i])){
                map2.put(a[i],1);
            }
            else{
                int tmp = map2.get(a[i]);
                tmp++;
                map2.put(a[i], tmp);
            }
        }

        Set <Map.Entry<Integer, Integer>> entrySet1 = map1.entrySet(),
                                          entrySet2 = map2.entrySet();

        for(Map.Entry<Integer, Integer> x : entrySet1){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println();
        for(Map.Entry<Integer,Integer> x : entrySet2){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
