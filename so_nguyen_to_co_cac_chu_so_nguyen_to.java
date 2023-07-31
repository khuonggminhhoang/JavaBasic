import java.util.Scanner;

public class so_nguyen_to_co_cac_chu_so_nguyen_to {
    public static boolean checkPrime(int n){
        if(n < 2 ) return false;
        for(int i = 2; i<= Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static boolean check(int n){
        while(n!=0){
            if(!checkPrime(n%10)){
                return false;
            }
            n/=10;
        }
        return true;
    }

    public static void countPrime(int a, int b){
        int cnt = 0;
        for(int i = a; i<= b ; ++i){
            if(check(i) && checkPrime(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        a = scn.nextInt();
        b = scn.nextInt();
        countPrime(a, b);
    }
}
