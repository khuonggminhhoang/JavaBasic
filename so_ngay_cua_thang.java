import java.util.Scanner;

public class so_ngay_cua_thang {
    public static boolean check(int year){
        if(year%400==0 || (year%4 == 0 && year%100 != 0 )){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;
        month = scanner.nextInt();
        year = scanner.nextInt();
        if(month >=1 && month <=12 && year >=1 ){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12){
                System.out.println("31");
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("31");
            }
            else {
                if(check(year)){
                    System.out.println("29");
                }
                else System.out.println("28");
            }
        }
        else System.out.println("INVALID");
    }
}
