import java.util.Scanner;

public class tinh_tong_chu_so_cua_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int sum = 0;
        while(n!=0){
            sum+= n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
