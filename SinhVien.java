import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;

    public static int cnt = 1;

    public double getGpa(){
        return this.gpa;
    }

    public String getMaSinhVien(){
        return this.maSinhVien;
    }

    public String dayStd(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/'){
            sb.insert(0,'0');
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, '0');
        }
        return sb.toString();
    }

    public String nameStd(String s){
        StringBuilder sb = new StringBuilder("");
        String[] arr = s.split("\\s+");
        for(String x : arr){
            sb.append( Character.toUpperCase( x.charAt(0) ) );
            for(int i=1; i<x.length(); ++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    SinhVien(String hoTen, String lop, String ngaySinh, double gpa){
        this.hoTen = nameStd(hoTen);
        this.lop = lop;
        this.ngaySinh = dayStd(ngaySinh);
        this.gpa = gpa;
        if(cnt < 10){
            this.maSinhVien = "SV00" + cnt;
        }
        else{
            this.maSinhVien = "SV0" + cnt;
        }
        cnt++;
    }

    public static void sort(SinhVien[] list){
        Arrays.sort(list, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getGpa() < o2.getGpa()){
                    return 1;
                }
                else if(o1.getGpa() > o2.getGpa()){
                    return -1;
                }
                else{
                    return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
                }
            }
            
        });
    }

    @Override
    public String toString(){
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " "
            + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        SinhVien[] arr = new SinhVien[n];
        for(int i=0; i<n; ++i){
            scn.nextLine();
            arr[i] = new SinhVien(scn.nextLine(), scn.nextLine(), scn.nextLine(),scn.nextDouble());
        }
         sort(arr);
        for(SinhVien x : arr){
            System.out.println(x);
        }
        scn.close();
    }
}