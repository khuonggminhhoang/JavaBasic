import java.util.Scanner;

public class doi_tien_tham_lam {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = {1000,500,200,100,50,20,10,5,2,1};
        int cnt = 0;
        long n = scn.nextLong();
        for(int x : a){
            cnt += n/x;
            n %= x;
        }
        System.out.println(cnt);
        scn.close();
    }
}