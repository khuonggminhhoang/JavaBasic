import java.util.Scanner;

public class NhanVien{
    private String employeeCode;
    private String employeeName;
    private int salaryOfDay;
    private int workDay;
    private String position;

    public static int cnt = 1;

    public static Scanner scn = new Scanner(System.in);

    public void inp(){
        this.employeeName = scn.nextLine();
        this.salaryOfDay = scn.nextInt();
        this.workDay = scn.nextInt();
        scn.nextLine();
        this.position = scn.nextLine();
        String tmp = cnt + "";
        if(tmp.length() == 1){
            this.employeeCode = "NV0" + tmp;
        }
        else{
            this.employeeCode = "NV" + tmp;
        }
        cnt++;
    }

    public int salaryOfMonth(){
        return this.salaryOfDay * this.workDay;
    }

    public int bonusMoney(){
        if(this.workDay < 22) return 0;
        else if(this.workDay >= 25) return salaryOfMonth() * 20 / 100;
        else {
            return salaryOfMonth() * 10 / 100;
        }
    }

    public int allowanceMoney(){
        if(this.position.equals("GD")){
            return 250000;
        }
        else if(this.position.equals("PGD")) {
            return 200000;
        }
        else if(this.position.equals("TP")){
            return 180000;
        }
        else {
            return 150000;
        }
    }

    public int income(){
        return salaryOfMonth() + bonusMoney() + allowanceMoney();
    }

    @Override
    public String toString(){
        return this.employeeCode + " " + this.employeeName + " "
                + this.salaryOfMonth() + " " + this.bonusMoney() + " "
                + this.allowanceMoney() + " " + this.income();
    }

    public static void main(String[] args) {
        
        NhanVien a = new NhanVien();
        a.inp();
        System.out.println(a);
    }
}