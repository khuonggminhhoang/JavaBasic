import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class sap_xep_theo_tri_tuyet_doi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        Integer[] a = new Integer[n];
        Integer[] tmparr = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
            tmparr[i] = a[i];
        }
        Arrays.sort(tmparr, new Comparator <Integer> (){
            public int compare(Integer o1, Integer o2){
                int x1 = Math.abs(o1 - x);
                int x2 = Math.abs(o2 - x);
                if( x1 <  x2){
                    return -1;
                }
                else if( x1 ==  x2){
                    if(o1 < o2) return -1;
                    else return 1;
                }
                else return 1;
            }
        });

        for(int y : tmparr) System.out.print(y + " ");
        System.out.println();

        Arrays.sort(a , new Comparator <Integer> (){
            public int compare (Integer o1, Integer o2){
                if(o1 % 2 ==0 && o2 %2 == 1){
                    return -1;
                }
                else if( o1 % 2 == 0 && o2 % 2 == 0 ){
                    if(o1 < o2) return -1;
                    else return 1;
                }
                else if( o1 % 2 == 1 && o2 % 2 ==1){
                    if(o1 > o2) return -1;
                    else return 1;
                }
                else return 1;
            }
        });
        for(int y : a) System.out.print(y + " ");
        scn.close();
    }
}

