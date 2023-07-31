import java.util.Scanner;

public class chia_tien {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a,b,c,n;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        n = scn.nextInt();
        boolean flag = false;
        if((a+b+c+n) % 3 ==0){
            int t = (a + b + c + n)/3;
            if(t >=a && t>=b && t>= c){
                flag = true;
            }
        }
        System.out.println((flag==true)? "YES" : "NO");
    }
}
