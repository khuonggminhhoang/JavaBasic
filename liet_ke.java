import java.util.Scanner;

public class liet_ke {
    public static boolean isPrime(int n){
        for(int i=2; i<= Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return n > 1;
    }

    public static boolean reverseNum(int n){
        int tmp = n, num = 0;
        while(tmp != 0){
            num = num*10 + tmp%10;
            tmp/=10;
        }
        return num == n;
    }

    public static boolean perfectSqare(int n){
        return Math.sqrt(n) == (int) Math.sqrt(n);
    }

    public static boolean sumIsPrime(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        return isPrime(sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        int ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0;
        for(int i=0; i<n; ++i){
            if(isPrime(a[i])) ans1++;
            if(reverseNum(a[i])) ans2++;
            if(perfectSqare(a[i])) ans3++;
            if(sumIsPrime(a[i])) ans4++;
        }
        System.out.println(ans1 + " " + ans2 + " " + ans3 + " " + ans4);
    }
}
