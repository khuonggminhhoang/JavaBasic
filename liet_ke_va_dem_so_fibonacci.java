import java.util.Scanner;

public class liet_ke_va_dem_so_fibonacci {
    public static long[] Fibo = new long[100];

    public static boolean check(long n){
        for(int i=0; i<=92; ++i){
            if(Fibo[i] == n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] a = new long[n];
        
        for(int i=0; i<n; ++i){
            a[i] = scn.nextLong();
        }

        //sinh 92 so fibo dau tien
        Fibo[0] = 0;
        Fibo[1] = 1;
        for(int i= 2; i<= 92; ++i){
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }
        //-------------------//
        boolean ok = false;
        for(int i=0; i<n; ++i){
            if(check(a[i])){
                System.out.print(a[i] + " ");
                ok = true;
            }
        }
        if(!ok) System.out.println("NONE");
    }
}
