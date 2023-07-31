import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien1 {
    private String msv;
    private String name;
    private String Class;
    private String birthday;
    private double gpa;
    public String email;

    SinhVien1(){}

    public String dayStd(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/'){
            sb.insert(0,'0');
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,'0');
        }
        return sb.toString();
    }

    public String nameStd(String s){
        StringBuilder sb  = new StringBuilder("");
        String[] arr = s.split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1; i<x.length(); ++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    SinhVien1(String msv, String name, String Class, String email){
        this.msv = msv;
        this.name = nameStd(name);
        this.Class = Class;
        this.email = email;
    }

    public String geTClass(){
        return this.Class;
    }

    public String getMsv(){
        return this.msv;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.name + " " + this.Class + " " + this.email;
    }

}

public class sinh_vien1 {
    public static void Search(String s, SinhVien1[] arr){
        String tmp = s;
        if(tmp.equals("CNTT")) tmp = "CONG NGHE THONG TIN";
        else if(tmp.equals("DTVT")) tmp = "DIEN TU VIEN THONG";
        else if(tmp.equals("KT")) tmp = "KE TOAN";
        else tmp = "MARKETING";
        System.out.println("DANH SACH SINH VIEN NGANH " + tmp +" :" );
        for(SinhVien1 x : arr){
            String ans = "";
            for(int i=0; i<x.geTClass().length(); ++i){
                if(!Character.isDigit(x.geTClass().charAt(i))){
                    ans+= x.geTClass().charAt(i);
                }
            }
            if(ans.equals(s)){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        SinhVien1[] a = new SinhVien1[n];
        for(int i=0; i<n; ++i){
            a[i] = new SinhVien1(scn.nextLine(), scn.nextLine(),scn.nextLine(), scn.nextLine());
        }
        int q = scn.nextInt();
        scn.nextLine();
        while(q-- > 0){
            String s = scn.nextLine();
            Search(s,a);
        }
    }
}
