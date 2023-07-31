import java.util.Scanner;

public class chuan_hoa_ten_1 {
    public static String nameStd(String s){
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1; i<x.length(); ++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String dayStd(String s){
        String[] arr = s.split("/");
        StringBuilder sb = new StringBuilder("");
        for(String x : arr){
            if(x.length() == 1){
                String tmp = "0" + x;
                sb.append(tmp + "/");
            }
            else sb.append(x + "/");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        System.out.println(nameStd(s1));
        System.out.println(dayStd(s2));
    }
}
