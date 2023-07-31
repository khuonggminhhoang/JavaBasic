import java.util.Scanner;

public class lop_phan_so {
    private long tuSo, mauSo;

    lop_phan_so(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static long gcd(long a, long b){
        while(b!=0){
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public String toString(){
        long tmp = gcd(this.tuSo, this.mauSo);
        return this.tuSo/tmp + "/" + this.mauSo/tmp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        lop_phan_so a = new lop_phan_so(scn.nextLong(), scn.nextLong());
        System.out.println(a);
    }
}
