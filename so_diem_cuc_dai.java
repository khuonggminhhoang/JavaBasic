import java.util.Scanner;

public class so_diem_cuc_dai {
        public static int[] dx = {1, 1, 1, 0, 0, -1, -1, -1},
                            dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        public static int countPoints(int[][] a, int n, int m, int i, int j){
            int ans = 1;
            for(int k = 0; k<8; ++k){
                int x = i + dx[k], y = j + dy[k];
                if(0 <=x && x < n && 0 <= y && y < m && a[i][j] <= a[x][y]){
                    ans = 0;
                    break;
                }
            }
            return ans;
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
        int res = 0;
        for(int i=0; i<n; ++i){
            for(int j=0; j <m; ++j){
                res += countPoints(a, n, m, i, j);
            }
        }
        System.out.println(res);
        scn.close();
    }
}
