import java.util.Scanner;

public class die_hard {
    public static boolean canSellTickets(int[] a, int n){
        int count25 = 0;
        int count50 = 0;
        for(int i=0; i<n; ++i){
            if(a[i] == 25){
                count25++;
            }
            else if(a[i] == 50){
                count50++;
                count25--;
            }
            else if(a[i] == 100){
                if(count50 > 0){
                    count50--;
                    count25--;
                }
                else{
                    count25-=3;
                }
            }
            if(count25 < 0 || count50 < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        System.out.println((canSellTickets(a, n)) ? "YES" : "NO");
    }
}
