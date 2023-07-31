import java.util.Scanner;

public class sang_so_nguyen_to {
    public static void sangSnt(int n){
        boolean[] p = new boolean[n+1];

        for(int i = 2; i<=n; ++i){
            p[i] = true;
        }

        for(int i=2; i<Math.sqrt(n); ++i){
            if(p[i]){
                for(int j = i*i; j <=n; j+=i){
                    p[j] = false;
                }
            }
        }

        for(int i=2; i<=n; ++i){
            if(p[i]) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        sangSnt(n);
    }
}
