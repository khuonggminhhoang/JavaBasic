import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class xau_co_dau_cuoi_giong_nhau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashMap <Character, Integer> map = new HashMap<>();
        long ans = 0;
        for(char x : s.toCharArray()){
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                int tmp = map.get(x);
                ++tmp;
                map.put(x,tmp);
            }
        }
        Set <Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> mp : entrySet){
            ans += 1l * (mp.getValue() +1) * mp.getValue()/2;
        }
        System.out.println(ans);
    }
}
