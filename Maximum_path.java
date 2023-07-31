import java.util.Scanner;

public class Maximum_path {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }

        for(int j=0; j<n; ++j){
            dp[0][j] = a[0][j];
        }

        for(int i=1; i<n; ++i){
            for(int j=0; j<n; ++j){
                if(j == 0){
                    dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]) + a[i][0];
                }
                else if(j == n-1){
                    dp[i][n-1] = Math.max(dp[i-1][n-1], dp[i-1][n-2]) + a[i][n-1]; 
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i-1][j+1])) + a[i][j];
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int j=0; j<n; ++j){
            max = Math.max(dp[n-1][j], max);
        }
        System.out.println(max);
        scn.close();
    }
}
