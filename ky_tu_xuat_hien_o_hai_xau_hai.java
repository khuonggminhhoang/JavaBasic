import java.util.Scanner;

public class ky_tu_xuat_hien_o_hai_xau_hai {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        char[] cnt = new char[256];
        for(char x : s1.toCharArray()){
            cnt[x] = 1;
        }
        for(char x : s2.toCharArray()){
            if(cnt[x] == 1) cnt[x] = 3;
            else if(cnt[x] == 0) cnt[x] = 2;
        }
        for(int i=0; i<256; ++i){
            if(cnt[i] == 1){
                System.out.print((char) i);
            }
        }
        System.out.println();
        for(int i=0; i<256; ++i){
            if(cnt[i] == 2){
                System.out.print((char) i );
            }
        }
    }
}
