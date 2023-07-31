import java.util.Scanner;

public class tim_duong_di {
    public static int n,m,s,t,u,v;
    public static int[][] a = new int[105][105];
    public static int[] dx = {-1, 1, 0, 0},
                        dy = {0, 0, -1, 1};

    public static void dfs(int x, int y){
        a[x][y] = 0;
        if(x == u-1 && y == v-1 ) return;
        for(int k =0; k<4; ++k){
            int x1 = x + dx[k], y1 = y + dy[k];
            if( 0 <= x1 && x1 < n && 0 <= y1 && y1 < m && a[x1][y1] == 1){
                dfs(x1,y1);         
            }
        }        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        s = scn.nextInt();
        t = scn.nextInt();
        u = scn.nextInt();
        v = scn.nextInt();
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        dfs(s-1,t-1);
        if(a[u-1][v-1] == 0) System.out.println("YES");
        else System.out.println("NO");
        scn.close();
    }
}
/*
3 5
1 1 3 5
0 1 1 0 0
0 1 1 1 1
1 0 0 0 1
 */