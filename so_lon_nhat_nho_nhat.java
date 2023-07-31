import java.util.Scanner;

public class so_lon_nhat_nho_nhat {
    public static void maxNum(int m, int s){
        int[] a = new int[m];
        for(int i=0; i<m; ++i){
            if(s > 9){
                a[i] = 9;
                s-=9;
            }
            else{
                a[i] = s;
                s = 0;
            }
        }
        for(int i=0; i<m; ++i){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void minNum(int m, int s){
        int[] a = new int[m];
        for(int i=m-1; i>=0; --i){
            if(s > 9){
                a[i] = 9;
                s-=9;
            }
            else if(i!= 0){
                a[i] = s-1;
                s = 1;
            }
            else{
                a[i] = s;
                s = 0;
            }
        }
        for(int i=0; i<m; ++i){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int s = scn.nextInt();
        if(9 * m < s){
            System.out.println("NOT FOUND");
        }
        else{
            minNum(m,s);
            maxNum(m,s);
        }
    }
}
