import java.util.Scanner;

public class mang_cong_don_frefix_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        // xây dựng mảng cộng dồn
        int[] f = new int[n];
        for(int i=0; i<n; ++i){
            if(i==0) f[i] = a[i];
            else f[i] = f[i-1] + a[i];
        }

        int left =scn.nextInt(),
            right = scn.nextInt();
            
        if(left == 0) System.out.println(f[right]);
        else
            System.out.println(f[right] - f[left-1]);    
        }
    }
    /*
     * ví dụ: cho mảng :
      9
      1 11 3 4 7 23 8 13 17
     * 
     * tính tổng từ vị trí i = 3 đến i = 5
     * 
     */