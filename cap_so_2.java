import java.util.Scanner;

public class cap_so_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int dis = Integer.MAX_VALUE;
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        for(int i=0; i<n-1; ++i){
            for(int j = i+1; j<n; ++j){
                dis = Math.min(dis, Math.abs(a[i]- a[j]));
            }
        }
        System.out.println(dis);
    }
}
