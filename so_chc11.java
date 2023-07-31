import java.util.Scanner;

public class so_chc11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int sum1 = 0, sum2 =0;
        for(int i=0; i<s.length(); ++i){
            if(i%2== 0){
                sum1 += (s.charAt(i) - '0');
            }
            else{
                sum2 += (s.charAt(i) - '0');
            }
        }
        if(Math.abs(sum1 - sum2) % 11 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
