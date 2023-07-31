import java.util.ArrayList;
import java.util.Scanner;

public class lon_nhat_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; ++i){
            Integer x = scn.nextInt();
            arr.add(x);
        }

        int query = scn.nextInt();
        while(query-- > 0){
            int select, element;
            select = scn.nextInt();
            switch(select){
                case 1 : {
                    element = scn.nextInt();
                    arr.add(element);
                    break;
                }
                case 2 : {
                    element = scn.nextInt();
                    while(arr.contains(element)){
                        arr.remove((Object) element);
                    }
                    break;
                }
                case 3 : {
                    Integer min = Integer.MAX_VALUE;
                    for(int i=0; i < arr.size(); ++i){
                        min = Math.min(min,arr.get(i));
                    }
                    System.out.println(min);
                    break;
                }
                case 4 : {
                    Integer max = Integer.MIN_VALUE;
                    for(int i=0; i < arr.size(); ++i){
                        max = Math.max(max,arr.get(i));
                    }
                    System.out.println(max);
                    break;
                }
            }
        }
        scn.close();
    }
}
