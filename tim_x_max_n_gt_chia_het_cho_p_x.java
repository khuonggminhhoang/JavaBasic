import java.util.Scanner;

public class tim_x_max_n_gt_chia_het_cho_p_x {

    //cách làm thông thường => chậm
    public static int solve(int n, int p){
        int res = 0;
        for(int i=p; i<=n; i+=p){
            int tmp = i;
            while(tmp % p ==0 ){
                ++res;
                tmp /= p;
            }
        }
        return res;
    }

    // công thức legendre
    public static int legendre(int n, int p){
        int res = 0;
        for(int i = p; i<=n; i*=p){
            res += n/i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p,n;
        n = scn.nextInt();
        p = scn.nextInt();
        System.out.println(solve(n, p));    // công thức bình thường construction algorithm
        System.out.println(legendre(n, p)); // ct legendre 
    }
}
/*
 * Đề : cho n!và só p cho trước. Tìm x lớn nhất sao cho n! chia hết cho p^x?
 * @ ct legendre
 * 
 * x = [n/p^1] + [n/p^2] + [n/p^3] + ... + [n/p^k]   (p^k <= n)
 */