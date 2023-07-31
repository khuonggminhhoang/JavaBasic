import java.util.*;

public class mang_012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] cnt = new int[3];
        while(n-->0){
            int x = scn.nextInt();
            cnt[x]++;
        }
        while(cnt[0]-- >0){
            System.out.print(0 + " ");
        }
        while(cnt[1]-- >0){
            System.out.print(1 + " ");
        }
        while(cnt[2]-- >0){
            System.out.print(2 + " ");
        }
    }
}
