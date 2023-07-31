import java.util.Scanner;

public class dem_chan_le_tong_chan_le {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int cntOdd = 0, cntEven = 0, sumOdd = 0, sumEven = 0;
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        for(int x : a){
            if(x % 2 == 0) {
                cntEven++;
                sumEven += x;
            }
            else{
                cntOdd++;
                sumOdd += x;
            }
        }
        System.out.println(cntEven);
        System.out.println(cntOdd);
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
