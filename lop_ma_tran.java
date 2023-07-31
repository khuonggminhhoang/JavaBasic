import java.util.Scanner;

class Matrix{
    private int  n,m;
    private int[][] a;
    
    Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public Matrix trans(){
        Matrix res = new Matrix(this.m, this.n);
        for(int i=0; i<this.m; ++i){
            for(int j = 0; j<this.n; ++j){
                res.a[i][j] = this.a[j][i];
            }
        }
        return res;
    }

    public void nextMatrix(Scanner sc){
        for(int i=0; i< this.n; ++i){
            for(int j = 0; j<this.m; ++j){
                this.a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix other){
        Matrix res = new Matrix(this.n, other.m);
        for(int i=0; i<this.n; ++i){
            for(int j = 0; j< other.m; ++j){
                res.a[i][j] = 0;
                for(int k = 0; k<this.m; ++k){
                    res.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString(){
        String ans = "";
        for(int i=0; i<this.n; ++i){
            for(int j=0; j<this.m;  ++j){
                ans += this.a[i][j] + " ";
            }
            ans += "\n";
        }
        return ans;
    }
    
}

public class lop_ma_tran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = a.trans();
        System.out.println(a.mul(b));
    }
}
