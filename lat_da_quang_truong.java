import java.util.Scanner;


public class lat_da_quang_truong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,m,a;
        n = scn.nextInt();
        m = scn.nextInt();
        a = scn.nextInt();
        long ans = (long) (Math.ceil((double) n/a) * Math.ceil((double) m/a));
        System.out.println(ans);
    }
}
// Math.ceil(a) làm tròn lên số thập phân a

// Math.floor(a) làm tròn xuống số thập phân a