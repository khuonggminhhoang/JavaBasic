import java.util.*;

public class maximum_distance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        HashMap <Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i=0; i<n; ++i){
            if(!map.containsKey(a[i])){
                map.put(a[i], i);
            }
            if(map.containsKey(a[i] + k)){
                ans = Math.max(ans, i - map.get(a[i] + k));
            }
            if(map.containsKey(a[i] - k)){
                ans = Math.max(ans, i - map.get(a[i]- k));
            }
        }
        System.out.println(ans);
    }
}
