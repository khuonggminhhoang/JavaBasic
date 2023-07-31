import java.util.*;

public class tong_nho_nhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        int num1 = 0, num2 = 0;
        for(int i=0; i<n; ++i){
            if(i%2 == 0){
                num1 = 10*num1 + a[i];
            }
            else {
                num2 = 10*num2 + a[i];
            }
        }
        System.out.println(num1 + num2);
    }
}
