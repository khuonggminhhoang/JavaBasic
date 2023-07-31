import java.util.Scanner;
import java.util.Arrays;

public class sap_xep_chu_so {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] t = new int[10];
        
        while(n-- > 0){
            int x = scn.nextInt();
            while( x != 0){
                t[x%10] = 1;
                x/=10;
            }
        }

        for(int i =0 ; i<10; ++i){
            if(t[i] != 0) System.out.print(i + " ");
        }
        scn.close();
    }
}
