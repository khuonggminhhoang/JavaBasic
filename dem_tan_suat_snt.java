import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dem_tan_suat_snt {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return n>1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedHashMap <Integer, Integer> map = new LinkedHashMap<>();
        while(scn.hasNext()){
            int x = scn.nextInt();
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                int tmp = map.get(x);
                ++tmp;
                map.put(x,tmp);
            }
        }
        Set <Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> mp : entrySet){
            if(isPrime(mp.getKey()))
                System.out.println(mp.getKey() + " " + mp.getValue());
        }
    }
}
