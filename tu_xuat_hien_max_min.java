import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tu_xuat_hien_max_min {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split("\\s+");
        TreeMap<String , Integer> map = new TreeMap<>();
        for(String x : arr){
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                int tmp = map.get(x);
                ++tmp;
                map.put(x,tmp);
            }
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        String ans1= "", ans2= "";
        Set <Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> mp : entrySet){
            if(mp.getValue() >= max){
                max = mp.getValue();
                ans1 = mp.getKey();
            }
            if(mp.getValue() <= min){
                min = mp.getValue();
                ans2 = mp.getKey();
            }
        }
        System.out.println(ans1 + " " + max);
        System.out.println(ans2 + " " + min);
    }
}
