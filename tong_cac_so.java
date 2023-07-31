import java.util.Scanner;

public class tong_cac_so {
    public static long Sum(String s){
        long sum = 0;
        long num = 0;
        for(int i=0; i < s.length(); ++i){
            if(Character.isDigit(s.charAt(i))){
                num = num*10 + (s.charAt(i) - '0');
            }
            else{
                sum += num;
                num = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        if(Character.isDigit(s.charAt(s.length()-1)) ){
            s = s + "a";
        }

        System.out.println(Sum(s));
        scn.close();
    }
}
