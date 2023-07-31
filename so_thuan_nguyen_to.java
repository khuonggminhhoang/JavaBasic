import java.util.Scanner;

public class so_thuan_nguyen_to {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i<= Math.sqrt(n); ++i){
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean allNum(int n){
        while(n!=0){
            int r = n%10;
            if(r != 2 && r != 3 && r != 5 && r != 7) return false;
            n/=10;
        }
        return true;
    }

    public static boolean checkSum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        if(isPrime(sum)) return true;
        return false;
    }

    public static void solve(int a, int b){
        int cnt = 0;
        for(int i= a; i<=b; ++i){
           if(allNum(i) &&  isPrime(i)&&checkSum(i)){
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
        solve(a, b);
    }
}
