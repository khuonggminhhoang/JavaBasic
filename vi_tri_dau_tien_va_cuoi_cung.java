import java.util.*;

public class vi_tri_dau_tien_va_cuoi_cung {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int[] a= new int[n];
        int savfirst = -1, savlast = -1;
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        for(int i=0; i<n; ++i){
            if(a[i] == x){
                savlast = i+1;
                if(savfirst == -1){
                    savfirst = i+1;
                }
            }
        }
        System.out.println(savfirst + " " + savlast);
    }
}
