import java.util.Scanner;

public class tong_chu_so_cua_so_nguyen {
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
        System.out.println(Sum(s));
    }
}
