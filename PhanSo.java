import java.util.Scanner;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    PhanSo(){}

    PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo sum(PhanSo a){
        PhanSo c = new PhanSo();
        c.tuSo = this.tuSo * a.mauSo + this.mauSo * a.tuSo;
        c.mauSo = this.mauSo * a.mauSo; 
        return c;
    }

    public PhanSo pow(){
        PhanSo c = new PhanSo();
        c.tuSo = this.tuSo * this.tuSo;
        c.mauSo = this.mauSo * this.mauSo;
        return c;
    }

    public PhanSo multiply(PhanSo a){
        PhanSo c = new PhanSo();
        c.tuSo = this.tuSo * a.tuSo;
        c.mauSo = this.mauSo * a.mauSo;
        return c;
    }

    public static long gcd(long a, long b){
        while(b!=0){
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    @Override
    public String toString(){
        long tmp = gcd(this.tuSo, this.mauSo);
        return this.tuSo / tmp + "/" + this.mauSo / tmp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(scn.nextInt(), scn.nextInt());
            PhanSo b = new PhanSo(scn.nextInt(), scn.nextInt());
            PhanSo c = (a.sum(b)).pow();
            System.out.print(c + " ");
            
            PhanSo d = a.multiply(b).multiply(c);
            System.out.println(d);
           
        }
    }
}
