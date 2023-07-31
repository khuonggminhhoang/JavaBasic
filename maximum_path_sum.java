import java.util.Scanner;

public class maximum_path_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];

        for(int i=0; i<n ; ++i){
            for(int j = 0; j<m; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        
        long[][] dp = new long[n][m];
        dp[0][0] = a[0][0];

        for(int i=1; i<n; ++i){
            dp[i][0] = dp[i-1][0] + a[i][0];
        }

        for(int j=1; j<m; ++j){
            dp[0][j] = dp[0][j-1] + a[0][j];
        }

        for(int i=1; i<n;++i){
            for(int j=1; j<m;++j){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + a[i][j];
            }
        }
        System.out.println(dp[n-1][m-1]);
        scn.close();
    }
}
