import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class HocSinh{
    private String mhs;
    private String hoTen;
    private double Toan, TiengViet, NgoaiNgu, VatLy, HoaHoc, SinhHoc, LichSu, Dia, GDCD, CongNghe;

    HocSinh(int cnt, String hoTen, double a1, double a2, double a3, double a4, double a5, double a6,double a7, double a8, double a9, double a10){
        this.mhs = "HS" + String.format("%02d", cnt);
        this.Toan = a1;
        this.TiengViet = a2;
        this.NgoaiNgu = a3;
        this.VatLy = a4;
        this.HoaHoc = a5;
        this.SinhHoc = a6;
        this.LichSu = a7;
        this.Dia = a8;
        this.GDCD = a9;
        this.CongNghe = a10;
        this.hoTen= hoTen;
    }

    public double diemTB(){
        return (Toan + TiengViet + NgoaiNgu + VatLy + HoaHoc + SinhHoc + LichSu + Dia + GDCD + CongNghe)/10;
    }

    public String phanLoai(){
        if(diemTB() >=9) return "XUAT SAC";
        if(diemTB() >=8 && diemTB() <= 8.9) return "GIOI";
        if(diemTB() >=7 && diemTB() <= 7.9) return "KHA";
        if(diemTB() >=5 && diemTB() <= 6.9) return "TB";
        return "YEU"; 
    }

    public String getMhs(){
        return this.mhs;
    }

    @Override
    public String toString(){
        return this.mhs + " " + this.hoTen + " " + String.format("%.1f",diemTB()) + " " + phanLoai();
    }
}

public class bang_diem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HocSinh[] a = new HocSinh[n];
        for(int i=0; i<n; ++i){
            scn.nextLine();
            a[i] = new HocSinh(i+1, scn.nextLine(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble());
        }

        Arrays.sort(a, new Comparator<HocSinh>(){

            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.diemTB() < o2.diemTB()){
                    return 1;
                }
                else if(o1.diemTB() > o2.diemTB()){
                    return -1;
                }
                else{
                    return o1.getMhs().compareTo(o2.getMhs());
                }
            }
            
        });

        for(Object x : a){
            System.out.println(x);
        }
    }
}
