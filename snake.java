import java.util.Scanner;

public class snake {
    public static int n;
    public static int[][] a = new int[105][105];

    public static void reverseRowArr(int i){
        int left = 0, right = n-1;
        while(left <= right){
            int tmp = a[i][left];
            a[i][left] = a[i][right];
            a[i][right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }

        for(int i=1; i<n; i+=2){
            reverseRowArr(i);
        }

        for(int i=0; i<n; ++i){
            for(int j =0; j<n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
