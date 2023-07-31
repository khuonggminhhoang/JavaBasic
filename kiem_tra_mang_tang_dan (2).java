import java.util.Scanner;

public class kiem_tra_mang_tang_dan {
    public static boolean increaseArr(int[] a, int n){
        if(n == 1){
            return true;
        }
        if(a[n-1] > a[n-2]) return increaseArr(a,n-1);
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        System.out.println((increaseArr(a,n)) ? "YES" : "NO");
        scn.close();
    }
}