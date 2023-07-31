import java.util.Scanner;

public class mang_danh_dau_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[1000001];
        int max = Integer.MIN_VALUE;
        while(n-- > 0){
            int x = scn.nextInt();
            a[x]++;
            max = Math.max(max, a[x]);
        }
        for(int i=0; i<1000001; ++i){
            if(a[i] == max){
                System.out.println(i +  " " + max);
                break;
            }
        }

    }
}
