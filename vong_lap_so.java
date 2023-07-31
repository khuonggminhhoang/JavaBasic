import java.util.Scanner;

public class vong_lap_so {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int num=1;
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                System.out.print(num + " ");
                ++num;
            }
            System.out.println();
        }
        System.out.println();

        //--------------------//
        for(int i=1; i<=n; ++i){
            num = i;
            for(int j=1; j<=n; ++j){
                System.out.print(num + " ");
                ++num;
            }
            System.out.println();
        }
        System.out.println();

        //---------------------//
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                if(j<=n-i) System.out.print('~');
                else System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        //--------------------//

        for(int i=1; i<=n; ++i){
            int start = i;
            int gap = n-1;
            for(int j=1; j<=i; ++j){
                System.out.print(start + " ");
                start+=gap;
                --gap;
            }
            System.out.println();
        }

    }
}
