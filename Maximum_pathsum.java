import java.util.Scanner;

public class Maximum_pathsum {
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

        for(int i=0; i<n; ++i){
            dp[i][0] = a[i][0];
        }

        for(int j = 1; j<n; ++j){
            for(int i=0; i<n; ++i){
                if(i == 0){
                    dp[0][j] = Math.max(dp[0][j-1], dp[1][j-1]) + a[0][j];
                }
                else if(i == n-1){
                    dp[n-1][j] = Math.max(dp[n-1][j-1], dp[n-2][j-1]) + a[n-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], Math.max(dp[i-1][j-1], dp[i+1][j-1])) + a[i][j];
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; ++i){
            max = Math.max(max,dp[i][n-1]);
        }
        System.out.println(max);
        scn.close();
    }
}
