import java.util.Scanner;

public class vi_tri_so_lon_nhat_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        int minVal = Integer.MAX_VALUE,
            maxVal = Integer.MIN_VALUE,
            pos1 = 0, pos2 = 0;

        for(int i=0; i<n; ++i){
            if(a[i] > maxVal){
                maxVal = a[i];
                pos1 = i;
            }
            if(a[i] <= minVal){
                minVal = a[i];
                pos2 = i;
            }
        }
        System.out.println(pos2 + " " + pos1);
    }
}
