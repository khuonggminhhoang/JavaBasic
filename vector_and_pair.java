import java.util.ArrayList;
import java.util.Scanner;

public class vector_and_pair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList <Double> arr = new ArrayList<>();
        int n = scn.nextInt();
        int[][] a = new int[n][2];
        for(int i=0; i<n; ++i){
            a[i][0] = scn.nextInt();
            a[i][1] = scn.nextInt();
        }
        for(int i = 0; i<n; ++i){
            Double x = Math.sqrt(a[i][0] * a[i][0] + a[i][1] * a[i][1]);
            arr.add(x);
        }
        for(Double x : arr){
            System.out.printf("%.2f ", x);
        }
        scn.close();
    }
}
