import java.util.Scanner;

public class so_dep1 {
    public static boolean isPrime(int n){
        for(int i=2; i<= Math.sqrt(n); ++i){
            if(n%i == 0) return false;
        }
        return n > 1;
    }

    public static int Sum(String s){
        int sum = 0;
        for(char x : s.toCharArray()){
            sum += x - '0';
        }
        return sum;
    }

    public static boolean result(String s){
        for(char x : s.toCharArray()){
            if(x != '2' && x != '3' && x != '5' && x != '7'){
                return false;
            }
        }
        if(!isPrime(Sum(s))) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(result(s) ? "YES" : "NO");
    }
}
