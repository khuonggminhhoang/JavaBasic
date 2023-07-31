import java.util.Scanner;

public class ThiSinh {
    private String contestantCode;
    private String fullName;
    private double toan, ly, hoa;

    ThiSinh(String contestantCode, String fullName, double toan, double ly, double hoa){
        this.contestantCode = contestantCode;
        this.fullName = fullName;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double mark(){
        double mak = 0;
        if(this.contestantCode.contains("KV1")){
            mak = 0.5; 
        }
        else if(this.contestantCode.contains("KV2")){
            mak = 1.0;
        }
        else{
            mak = 2.5;
        }
        return this.toan + this.ly + this.hoa + mak;
    }

    public void print(){
        System.out.print(this.contestantCode + " " + this.fullName + " "  + this.contestantCode.charAt(2) + " ");
        if((int) mark() == mark()){
            System.out.print((int) mark() + " ");
        }
        else System.out.print(String.format("%.1f",mark()) + " ");

        if(mark() < 24){
            System.out.println("TRUOT");
        }
        else System.out.println("TRUNG TUYEN");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ThiSinh a = new ThiSinh(scn.nextLine(), scn.nextLine(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble());
        a.print();
        scn.close();
    }
}
