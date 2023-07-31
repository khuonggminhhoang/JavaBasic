import java.util.Scanner;

public class ki_tu_xuat_hien_nhieu_nhat_trong_xau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int[] cnt = new int[256];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char charMax = 'a', charMin = 'a';
        for(char x : s.toCharArray()){
            cnt[x]++;
        }
        for(int i=0; i<256; ++i){
            if(cnt[i] != 0){
                max = Math.max(max, cnt[i]);
                min = Math.min(min,cnt[i]);
            }
        }
        for(int i=0; i<256 ; ++i){
            if(cnt[i] == max){
                charMax = (char) i;
            }
            if(cnt[i] == min){
                charMin = (char) i;
            }
        }
        System.out.println(charMax + " " + max);
        System.out.println(charMin + " " + min);
    }
}
