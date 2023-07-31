import java.util.Scanner;

public class tong_chan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x, sum = 0;
        for(int i=0; i<n; ++i){
            x = scn.nextInt();
            if(x%2 ==0){
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
