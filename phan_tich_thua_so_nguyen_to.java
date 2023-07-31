import java.util.Scanner;

public class phan_tich_thua_so_nguyen_to {
    public static void factorize(int n){
        for(int i=2; i<=Math.sqrt(n); ++i){
            while(n%i==0){
                System.out.print(i + " ");
                n/=i;
            }
        }
        if(n>1) System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        factorize(n);
    }
}
