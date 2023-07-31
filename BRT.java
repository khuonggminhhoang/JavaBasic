import java.util.*;


public class BRT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        TreeMap <Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<n; ++i) a[i] = scn.nextInt();
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; ++i){
            min = Math.min(min, Math.abs(a[i] - a[i+1]));
            if(!map.containsKey(Math.abs(a[i] - a[i+1]))){
                map.put(Math.abs(a[i] - a[i+1]),1);
            }
            else{
                int tmp = map.get(Math.abs(a[i] - a[i+1]));
                ++tmp;
                map.put(Math.abs(a[i] - a[i+1]),tmp);
            }
        }
        Set <Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> mp : entrySet){
            System.out.println(mp.getKey() + " " + mp.getValue());
            break;
        }
   }
}
