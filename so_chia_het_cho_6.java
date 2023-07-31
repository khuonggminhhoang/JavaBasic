import java.util.Scanner;

public class so_chia_het_cho_6 {
    public static int Sum(String s){
        int sum = 0;
        for(char x : s.toCharArray()){
            sum += x - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        if((s.charAt(s.length()-1) - '0') %2 == 0 && Sum(s) % 3 ==0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
