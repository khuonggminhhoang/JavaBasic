import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien{
    private String mnv;
    private String name;
    private String sex;
    private String birthday;
    private String address;
    private String tax;
    private String dayContract;

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

    NhanVien(int cnt, String name, String sex, String birthday, String address, String tax, String dayContract){
        this.mnv = String.format("%05d", cnt);
        this.name = name;
        this.sex = sex;
        this.birthday = dayStd(birthday);
        this.address = address;
        this.tax = tax;
        this.dayContract = dayStd(dayContract);
    }

    public String getBirthday(){
        return this.birthday;
    }

    public String getMnv(){
        return this.mnv;
    }

    @Override
    public String toString(){
        return this.mnv + " " + this.name + " " + this.sex + " " + this.birthday + " "
                + this.address + " " + this.tax + " " + this.dayContract;
    }
}

public class nhan_vien_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        NhanVien[] a = new NhanVien[n];
        for(int i=0; i<n; ++i){
            a[i] = new NhanVien(i+1, scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
        }

        Arrays.sort(a, new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                String[] tmp1 = o1.getBirthday().split("/");
                String[] tmp2 = o2.getBirthday().split("/");
                String s1 = tmp1[2] + tmp1[1] + tmp1[0];
                String s2 = tmp2[2] + tmp2[1] + tmp2[0];
                if(!s1.equals(s2)){
                    return s1.compareTo(s2);
                }
                else{
                    return o1.getMnv().compareTo(o2.getMnv());
                }
            }
            
        });

        for(Object x : a){
            System.out.println(x);
        }
    }
}
