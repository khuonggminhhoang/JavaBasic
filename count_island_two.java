import java.util.Scanner;

public class count_island_two {
    public static int[] dx = {1,0, -1,0, -1, 1, -1, 1},
                        dy = {0,1, 0 ,-1, -1, 1, 1, -1};
    public static void DFS(int[][] a , int n, int m, int i, int j){
        a[i][j] = 0;
        for(int k = 0; k < 8; ++k){
            int x = i + dx[k], y = j + dy[k];
            if(x >=0 && x < n && y >=0 && y < m  && a[x][y] == 1){
                DFS(a,n,m,x,y);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] a = new int[n][m];
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                a[i][j] = scn.nextInt();
            }
        }
        int cnt = 0;
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                if(a[i][j] == 1){
                    DFS(a,n,m,i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        scn.close();
    }
}
