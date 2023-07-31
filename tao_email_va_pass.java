import java.util.Scanner;

public class tao_email_va_pass {
    public static void solve(String s){
        String[] strArr = s.split("\\s+");
        String strTmp = strArr[strArr.length-1];
        String[] arrstr = strTmp.split("/");
        StringBuilder pass = new StringBuilder("");
        for(int i=0; i<3; ++i){
            if(arrstr[i].charAt(0) == '0'){
                pass.append(arrstr[i].charAt(1));
            }
            else pass.append(arrstr[i]);
        }
        
        strTmp = strArr[strArr.length - 2];
        StringBuilder email = new StringBuilder("");
        for(int i=0; i<strTmp.length(); ++i){
            email.append(Character.toLowerCase(strTmp.charAt(i)));
        }
        for(int i=0; i< strArr.length - 2; ++i){
            email.append(Character.toLowerCase(strArr[i].charAt(0)));
        } 
        email.append("@xyz.edu.vn");
        System.out.println(email.toString());
        System.out.println(pass.toString());
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        while(n-- > 0){
            String s = scn.nextLine();
            solve(s);
        }
    }
}
