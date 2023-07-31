import java.util.Scanner;

public class mang_danh_dau_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] t = new int[1000001];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
            t[a[i]]++;
            max = Math.max(max, t[a[i]]);
        }
        for(int i=0; i<n; ++i){
            if(max == t[a[i]]){
                System.out.println(a[i] + " " + max);
                break;
            }
        }

    }
}
