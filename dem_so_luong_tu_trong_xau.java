import java.util.Scanner;

public class dem_so_luong_tu_trong_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arrStrings = s.split("\\s+");
        int cnt = 0 ;
        for(String x : arrStrings){
            cnt++;
        }
        System.out.println(cnt);
    }
}
