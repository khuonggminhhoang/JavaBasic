import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_learn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = "Java 28tech";
        System.out.println(s.charAt(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String t = "Java 28TECH"; 
        System.out.println(s.concat(t));    // s = s+t;
        System.out.println(s.compareTo(t));
        System.out.println(s.compareToIgnoreCase(t));
        System.out.println(s.substring(5,9));
        System.out.println(s.substring(5));
        System.out.println(s.subSequence(5,9));

        System.out.println("---------------------------");
        String st = "java    28tech   C++   28tech.com.vn";
        String[] arr = st.split("\\s+");
        for(String x : arr){
            System.out.println(x);
        } 
        
        // sử dụng lớp StringTokenizer để tách xâu:
        System.out.println("---------------------------");
        StringTokenizer stn = new StringTokenizer(st);
        while(stn.hasMoreTokens()){
            System.out.println(stn.nextToken());
        }

        // đếm số kí tự theo yêu cầu:
        int digit = 0, lower = 0, upper = 0, special = 0;
        for(char x : st.toCharArray()){
            if(Character.isDigit(x)){
                ++digit;
            }
            else if(Character.isLowerCase(x)){
                ++lower;
            }
            else if(Character.isUpperCase(x)){
                ++upper;
            }
            else ++special;
        }
        System.out.println(digit + " " + lower + " " + upper + " " + special);

        // chuyển số thành xâu và ngược lại:
        // 1. số thành xâu
        int n = 123456789;
        String str = n + "";
        System.out.println(str);
        // 2. chuyển xâu thành số
        str = "135792468";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // class BigInteger
        System.out.println("-----------------------");
        String s1 = "16283846493749397203829284620";
        String s2 = "1038336249459574735282";
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1.abs());
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2));
        BigInteger tmp = new BigInteger("15682633");
        System.out.println(num2.multiply(tmp));

        // sd mảng đánh dấu đếm tần suất xuất hiện các ký tự
        // class StringBuilder:
        String s3 = "hOanG MInh khUOng";
        StringBuilder sb = new StringBuilder("");
        String[] strArr = s3.split("\\s+"); 
        for(String x : strArr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1; i<x.length(); ++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}


/*
 * [string].charAt(x) : Truy nhập ký tự tại vị trí x
 * [string].toUpperCase() : trả về xâu ở dạng in hoa, hàm này không thay đổi xâu ban đầu
 * [string].toLowerCase() : trả vè xâu ở dạng in thường, hàm này ko thay đổi xâu ban đầu
 * [string].concat([string]): nối xâu kí tự khác vào cuối xâu hiện tại, 
 * có thể sd toán tử + để làm chức năng tương tự (vd : s.concat(t) <=> s+t)
 * [string].compareTo([string]) : so sánh 2 xâu kí tự theo thứ tự từ điển, 2 xâu = return 0; < return số âm, > return số dương
 * [string].compareToIgnoreCase([string]) : như t.compareTo(s) , bỏ qua in hoa, in thường khi so sánh 
 * [string].substring(x) : cắt  xâu con từ vị trí x đến cuối xâu
 * [string].substring(begin_ind, end_ind) : cắt ra xâu con từ begin_ind đến end_ind
 * [string].subSequence(begin_ind, end_ind) : tương tự [string].substring(begin, end)
 * [string].contains([string]) : check xâu con return true nếu tồn tại, false nếu ko
 * 
 * [string].split("\\s+") : tách các từ trong xâu theo dấu cách, hàm này trả về 1 mảng chứa các từ trong xâu.
 * Hoặc cũng có thể dùng lớp StringTokenizer :
 * class Charater:
 *      isDigit(char c) : ktra chữ số
 *      isLowerCase(char c) : ktra chữ in thường
 *      isUpperCase(char c) : ktra chữ in hoa
 *      isAlphabetic(char c) : ktra chữ cái
 *      toLowerCase(char c) : chuyển thành chữ in thường
 *      toUpperCase(char c) : chuyển thành chữ in hoa
 * class BigInteger:
 * class StringBuilder : để sd các hàm chèn, xóa, thêm ký tự vì String
 *                       trong java ko thể thay đổi một khi nó đã được khai báo.
 * 
 */