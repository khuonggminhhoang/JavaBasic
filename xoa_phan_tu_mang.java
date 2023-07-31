import java.util.Scanner;

public class xoa_phan_tu_mang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[1005];
        int n = scn.nextInt(),
            x = scn.nextInt();
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();

        int pos = 0, ok = 0;
        for(int i=0; i<n; ++i){
            if(a[i] == x) {
                pos = i;
                ok = 1;
                break;
            }
        }
        if(ok == 0) {
            System.out.println("NOT FOUND");
            return;
        }

        for(int i=pos; i<n-1; ++i){
            a[i] = a[i+1];
        }
        --n;

        for(int i=0; i<n; ++i){
            System.out.print(a[i] + " ");
        }
    }
}
