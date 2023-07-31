import java.util.Scanner;

public class tron_hai_day {
    public static void merge(int[] a, int n, int[] b, int m){
        int i =0, j=0;
        while(i <n && j < m){
            if(a[i] <= b[j]){
                // System.out.print("b" + (i+1) + " ");
               System.out.print(a[i] + " ");
                ++i;
            }
            else {
                // System.out.print("c" + (j+1) + " ");
                System.out.print(b[j] + " ");
                ++j;
            }
        }

        while(i < n){
            // System.out.print("b" + (i+1) + " ");
            System.out.print(a[i] + " ");
            ++i;
        }

        while(j < m){
            // System.out.print("c" + (j+1) + " ");
            System.out.print(b[j] + " ");
            ++j;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),
            m = scn.nextInt();
        int[] b = new int[n],
              c = new int[m];

        for(int i=0; i<n; ++i) b[i] = scn.nextInt();
        for(int j=0; j<m; ++j) c[j] = scn.nextInt();
        merge(b,n,c,m);
        scn.close();
    }
}
