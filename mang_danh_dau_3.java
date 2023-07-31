import java.util.Scanner;

public class mang_danh_dau_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] t = new int[1000001];

        for(int i=0; i<n; ++i) {
            a[i] = scn.nextInt();
            t[a[i]]++;
        }

        for(int x : a){
            if(t[x]!=0){
                System.out.println(x + " " + t[x]);
                t[x] = 0;
            }
        }

    }
}
