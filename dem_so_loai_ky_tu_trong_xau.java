import java.util.Scanner;

public class dem_so_loai_ky_tu_trong_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int digit = 0, alpha = 0, special = 0;
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                digit++;
            }
            else if(Character.isAlphabetic(x)){
                alpha++;
            }
            else special++;
        }
        System.out.println(alpha + " " + digit + " " + special);
    }
}
