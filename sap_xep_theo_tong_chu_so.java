import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_theo_tong_chu_so {
    public static int sum(int n){
        int Sum = 0;
        while(n!= 0){
            Sum += n%10;
            n/=10;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();

        for(int i=0; i<n; ++i){
            int x = scn.nextInt();
            arr.add(x);
        }        

        Collections.sort( arr, new Comparator <Integer> (){
            public int compare(Integer o1, Integer o2){
                if(sum(o1) < sum(o2)) return -1;
                else if(sum(o1) == sum(o2)){
                    if(o1 < o2) return -1;
                    else return 1;
                }
                else return 1;
            }
        });

        for(Object x : arr){
            System.out.print(x + " ");
        }
    }
}
