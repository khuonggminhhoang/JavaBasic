import java.util.Scanner;

public class duong_di_cua_quan_xe {
    public static int n, s,t, cnt;
    public static int[][] a = new int[25][25];
    public static int[] dx = {0, 0, -1, 1},
                        dy = {-1, 1, 0, 0};

    public static void dfs(int x, int y){
        a[x][y] = 1;
        cnt++;
        for(int i=0; i<4;++i){
            int x1 = x + dx[i], y1 = y + dy[i];
            if(0 <= x1 && x1 <n && 0 <= y1 && y1 < n && a[x1][y1] == 0){
                dfs(x1,y1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        s = scn.nextInt();
        t = scn.nextInt();
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        dfs(s-1,t-1);
        System.out.println(cnt);
        scn.close();
    }
}
