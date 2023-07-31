import java.util.Scanner;

public class giai_phuong_trinh {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,n;
        a = scn.nextInt();
        b = scn.nextInt();
        n = scn.nextInt();
        for(int x = 0; x <= n/a ; ++x){
            int remain = n-a*x;
            if(remain % b ==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

// ax + by = n 
