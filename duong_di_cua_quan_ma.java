import java.util.Scanner;

public class duong_di_cua_quan_ma {
    public static int n,s,t,u,v;
    public static int[][] a = new int[105][105];
    public static int[] dx = {-2, -2, 2, 2, -1, 1, -1, 1},
                        dy = {-1, 1, -1, 1, -2, -2, 2, 2}; 
    public static void dfs(int x, int y){
        a[x][y] = 0;
        if(x == u-1 && y == v-1) return;
        for(int k=0; k<8; ++k){
            int x1 = x + dx[k], y1 = y + dy[k];
            if(0 <= x1 && x1 < n && 0 <= y1 && y1 < n && a[x1][y1] == 1){
                dfs(x1,y1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        s = scn.nextInt();
        t = scn.nextInt();
        u = scn.nextInt();
        v = scn.nextInt();
        for(int i=0; i<n; ++i){
            for(int j = 0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        dfs(s-1, t -1);
        if(a[u-1][v-1] == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
