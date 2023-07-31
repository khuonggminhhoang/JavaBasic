import java.util.*;

public class liet_ke_va_dem {
    public static boolean check(int n){
        while(n > 9){
            int x1 = n%10;
            n/=10;
            int x2 = n%10;
            if(x1 < x2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        TreeMap <Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        while(scn.hasNext()){
            Integer x = scn.nextInt();
            if(check(x)){
                arr.add(x);
                if(!map.containsKey(x)){
                    map.put(x,1);
                }
                else{
                    int tmp = map.get(x);
                    ++tmp;
                    map.put(x,tmp);
                }
            }
        }
        Collections.sort(arr, new Comparator <Integer>(){
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1) == map.get(o2)) return o1 - o2;
                else return map.get(o2) - map.get(o1);
            }
        });
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        for(Integer x : arr){
            set.add(x);
        }
        for(Integer x : set){
            System.out.println(x + " " + map.get(x));
        }
        scn.close();
    }
}
