import java.util.Scanner;

public class kiem_tra_mang_doi_xung {
    public static boolean check(int[] a, int left, int right){
        if(left >= right) return true;
        if(a[left] == a[right]) return check(a,left + 1, right - 1);
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        System.out.println(check(a, 0, n-1));
    }
}
