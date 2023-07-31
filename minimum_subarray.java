import java.util.*;

public class minimum_subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt(), k = scn.nextInt();
        // int[][] dp = new int[n][n];
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        // dp[0][0] = a[0];
        // for(int j=1; j<n; ++j){
        //     dp[0][j] = dp[0][j-1] + a[j]; 
        // }
        // for(int i=1; i<n; ++i){
        //     for(int j = i; j<n; ++j){
        //         dp[i][j] = dp[i-1][j] - dp[i-1][i-1];
        //     }
        // }
        // int ans = Integer.MAX_VALUE;
        // int ok = 0;
        // for(int i=0; i<n; ++i){
        // outer : for(int j=i; j<n; ++j){
        //         if(dp[i][j] == k){
        //             if(i!=j) ans = Math.min(ans,Math.abs(i-j) + 1);
        //             else {
        //                 ans = 1;
        //                 break outer;
        //             }
        //             ok = 1;
        //         }
        //     }
        // }
        // if(ok == 0) ans = -1;
        // System.out.println(ans);
        long sum = 0;
        int ans = Integer.MAX_VALUE;
        HashMap <Long, Integer> map = new HashMap<>();
        for(int i=0; i<n; ++i){
            sum+= a[i];
            if(sum == k){
                ans = Math.min(ans, i+1);
            }
            if(map.containsKey(sum - k)){
                ans = Math.min(ans, i - map.get(sum-k));
            }
            map.put(sum,i);
        }
        if(ans == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}

