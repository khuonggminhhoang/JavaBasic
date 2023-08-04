import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc{
    private String tenMon;
    private int soTin;
    public double diem;

    MonHoc(String tenMon, int soTin, double diem){
        this.tenMon = tenMon;
        this.soTin = soTin;
        this.diem = diem;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getSoTin() {
        return soTin;
    }

    public double getDiem() {
        return diem;
    }
}

class SinhVien {
    private String msv, hoTen, lop;
    private MonHoc[] monHocs;
    private double gpa;

    SinhVien(String msv, String hoTen, String lop, MonHoc[] monHocs){
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.monHocs = monHocs;
    }

    public String getMsv(){
        return this.msv;
    }

    public double getGpa(){
        double totalDiem = 0;
        int totalTin = 0;

        for(MonHoc x : this.monHocs){
            totalDiem += x.getSoTin()*x.getDiem();
            totalTin += x.getSoTin();
        }
        this.gpa = totalDiem/totalTin;
        return this.gpa;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.hoTen + " " + this.lop + " " + String.format("%.2f", this.getGpa())
        + "\n------------------------";
    }

}

class sortSinhVien implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2){
        if(o1.getGpa() != o2.getGpa()){
            if(o1.getGpa() > o2.getGpa()) return -1;
            else return 1;
        }
        else return o1.getMsv().compareTo(o2.getMsv());
    }
}

public class student_and_subject {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        SinhVien[] arr = new SinhVien[n];
        for(int i=0; i<n; ++i){
            String trash = scn.nextLine();
            String msv = scn.nextLine();
            String hoTen = scn.nextLine();
            String lop = scn.nextLine();

            int m = scn.nextInt();
            scn.nextLine();
            MonHoc[] monHocs = new MonHoc[m];
            for(int j = 0; j<m; ++j){
                String tenMon = scn.nextLine();
                int soTin = scn.nextInt();
                double diem = scn.nextDouble();
                scn.nextLine();
                monHocs[j] = new MonHoc(tenMon, soTin, diem);
            }
            arr[i] = new SinhVien(msv, hoTen, lop, monHocs);
        }

        Arrays.sort(arr, new sortSinhVien());
        for(SinhVien x : arr){
            System.out.println(x);
        }
        scn.close();
    }
}
