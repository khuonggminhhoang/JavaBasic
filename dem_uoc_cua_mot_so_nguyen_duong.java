import java.util.Scanner;

public class dem_uoc_cua_mot_so_nguyen_duong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final int MOD =(int) 1e9 + 7;
        int t = scn.nextInt();
        long ans = 1;
    
        while(t!=0){
            int p, e;
            p = scn.nextInt();
            e = scn.nextInt();
            ans = ((ans%MOD) * (e + 1)%MOD) %MOD;
            --t;
        }
        System.out.println(ans);
    }
}

/*
 * n = p1^e1 * p2^e2 * p3^e3 + ...
 * => số ước của n = (e1 +1)(e2 + 1)(e3 + 1)...
 * 
 * 
 * 
 */
