import java.util.Scanner;

public class so_lon_hon_cac_so_dung_truoc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        int max = a[0];
        System.out.print(a[0] + " ");
        for(int i=1; i<n; ++i){
            if(a[i] > max){
                System.out.print(a[i] + " ");
                max = a[i];
            }
        }
    }
}
