import java.util.Scanner;

public class GiaoVien {
    private String quotaCode;
    private String fullName;
    private int salary;

    GiaoVien(String quotaCode, String fullname, int salary ){
        this.quotaCode = quotaCode;
        this.fullName = fullname;
        this.salary = salary;
    }

    public int income(){
        String tmp = quotaCode.substring(0,2);
        int temp = Integer.parseInt(quotaCode.substring(2));
        int ans = salary * temp;
        if(tmp.equals("HT")){
            ans += 2000000;
        }
        else if(tmp.equals("HP")){
            ans += 900000;
        }
        else{
            ans += 500000;
        }
        return ans;
    }

    @Override
    public String toString(){
        return this.quotaCode + " " + this.fullName + " " + Integer.parseInt(quotaCode.substring(2)) + " " + income();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GiaoVien a= new GiaoVien(scn.nextLine(), scn.nextLine(), scn.nextInt());
        System.out.println(a);
        scn.close();
    }
}
