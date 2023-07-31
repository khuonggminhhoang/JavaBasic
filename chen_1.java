import java.util.Scanner;

public class chen_1 {
    public static void insertArr(int[] a, int n,int x, int pos){
        for(int i=n-1; i>=pos-1; --i){
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        ++n;

        for(int i=0; i<n; ++i){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[1005];
        int n = scn.nextInt(),
            x = scn.nextInt(),
            pos = scn.nextInt();

        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        insertArr(a, n, x, pos);
        
    }
}

/*
8 292 5
343 473 572 525 210 2 874 318 
 
 */
