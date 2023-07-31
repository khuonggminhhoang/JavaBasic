import java.util.Scanner;
import java.util.TreeMap;

public class tao_email_va_pass2 {
    public static String pass(String s){
        String[] arr = s.split("/");
        String ans = "";
        for(int i=0; i < arr.length; ++i){
            if(arr[i].charAt(0) == '0'){
                ans += arr[i].charAt(1);
            }
            else ans += arr[i];
        }
        return ans;
    }

    public static String email(String[] s){
        String ans = "";
        String s1 = s[s.length - 2];
        for(char x : s1.toCharArray()){
            ans += Character.toLowerCase(x);
        }
        for(int i=0; i<s.length-2; ++i){
            ans += Character.toLowerCase(s[i].charAt(0));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        TreeMap <String, Integer> map = new TreeMap<>();
        for(int i=0; i<n; ++i){
            String s = scn.nextLine();
            String[] strArr = s.split("\\s+");
            String first = email(strArr);
            String second = pass(strArr[strArr.length - 1]);
            if(!map.containsKey(first)){
                map.put(first,1);
                System.out.println(first + "@xyz.edu.vn");
                System.out.println(second);
            }
            else{
                int tmp = map.get(first);
                ++tmp;
                map.put(first, tmp);
                System.out.println(first + map.get(first) + "@xyz.edu.vn");
                System.out.println(second);
            }
            
        }
    }
}
