import java.util.Scanner;

public class so_chc4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        if(s.length() == 1){
            if((s.charAt(0) - '0') % 4 ==0) System.out.println("YES");
            else
                System.out.println("NO");  
        }
        else{
            int num = (s.charAt(s.length() - 2) - '0') * 10 + (s.charAt(s.length() - 1) - '0');
            if(num%4 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
