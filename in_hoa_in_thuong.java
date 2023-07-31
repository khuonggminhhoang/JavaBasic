import java.util.Scanner;

public class in_hoa_in_thuong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        for(char x : s.toCharArray()){
            if(Character.isLowerCase(x)){
                System.out.print(Character.toUpperCase(x));
            }
            else System.out.print(x);
        }
        System.out.println();
        for(char x : s.toCharArray()){
            if(Character.isUpperCase(x)){
                System.out.print(Character.toLowerCase(x));
            }
            else System.out.print(x);
        }
    }
}
