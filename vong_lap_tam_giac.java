import java.util.Scanner;

public class vong_lap_tam_giac {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();

        for(int i=1; i<=n; ++i){
            for(int j = 1; j<=i; ++j){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //--------------------------//
        for(int i=1; i<=n; ++i){
            for(int j = 1; j<=n-i+1; ++j){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        
        //---------------------------//
        for(int i=1; i<=n; ++i){
            for(int j = 1; j<=n; ++j){
                if(j < n-i+1) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        //--------------------------//
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                if(j<i) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
        //-------------------------//
        for(int i=1; i<=n;++i){
            for(int j=1; j<=i; ++j){
                if(i == j || j == 1 || i == n) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
