import java.util.*;

public class cap_so_bang_nhau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        TreeMap <Integer, Integer> map = new TreeMap<>();
        long cnt = 0;
        for(int i=0; i<n; ++i){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else{
                int tmp = map.get(a[i]);
                ++tmp;
                map.put(a[i], tmp);
            }
        }

        Set <Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> mp : entrySet){
                int m = mp.getValue();
                cnt +=  1l*m*(m-1)/2;
        }
        System.out.println(cnt);
    }
}

/*
 tổ hợp chập 2 của n = n(n-1)/2;
 
 */