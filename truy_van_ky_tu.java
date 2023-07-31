import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class truy_van_ky_tu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        int min = 1000001, max = 1;
        for(int i=0; i< s.length(); ++i){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , 1);
            }
            else{
                int tmpVal = map.get(s.charAt(i));
                ++tmpVal;
                map.put(s.charAt(i), tmpVal);
            }
        }

        Set <Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for( Map.Entry<Character, Integer> entry : entrySet){
            max = Math.max(max,entry.getValue());
            min = Math.min(min,entry.getValue());
        }
        for( Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() == max){
                System.out.println(entry.getKey() + " " + entry.getValue());
                break;
            }
        }
        char ans = s.charAt(0);
        for( Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() == min){
                ans = entry.getKey();
            }
        }
        System.out.println(ans + " " + min);
        System.out.println(map.size());
        scn.close();
    }
}