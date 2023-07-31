import java.util.Scanner;

public class so_lon_thu_nhat_so_lon_thu_hai {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        int max1 = -1, max2 = -1;
        // int index = 0;
        // for(int i = 0; i<n; ++i){
        //     if(a[i] > max1){
        //         max1 = a[i];
        //         index = i;
        //     }
        // }

        // for(int i=0; i<n; ++i){
        //     if(a[i] > max2 && i != index){
        //         max2 = a[i];
        //     }
        // }
        for(int i=0; i<n; ++i){
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
