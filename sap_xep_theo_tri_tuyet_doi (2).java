import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_theo_tri_tuyet_doi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; ++i){
            int x = scn.nextInt();
            arr.add(x);
        }
        Collections.sort(arr, new Comparator <Integer>(){
            public int compare( Integer o1, Integer o2){
                if(Math.abs(o1) < Math.abs(o2)){
                    return -1;
                }
                else return 1;
            } 
        });

        for(Object x : arr){
            System.out.print(x + " ");
        }
        scn.close();
    } 
}
