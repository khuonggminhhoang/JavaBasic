import java.util.Scanner;

public class dien_tich {
    public static int n,m, cnt;
    public static int[][] a = new int[505][505];
    public static int[] dx = {-1, 1, 0, 0},
                        dy = {0, 0, -1, 1};

    public static void dfs(int x, int y){
        a[x][y] = 0;
        cnt++;
        for(int i=0; i<4; ++i){
            int x1 = x + dx[i], y1 = y + dy[i];
            if(0 <= x1 && x1 < n && 0<= y1 && y1 <m && a[x1][y1] == 1){
                dfs(x1,y1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        int ans = 0;
        for(int i=0; i<n; ++i){
            for(int j=0; j<m;++j){
                cnt = 0;
                if(a[i][j] == 1){
                    dfs(i,j);
                    ans = Math.max(ans,cnt);
                }
            }
        }
        System.out.println(ans);
        scn.close();
    }
}