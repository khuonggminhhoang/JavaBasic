import java.util.Scanner;

public class gui_thu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        for(int i=0; i<n; ++i){
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            if(i == 0){
                min = Math.min(min, Math.abs(a[i]- a[i+1]));
                max = Math.max(max, Math.abs(a[i] - a[n-1]));
            }
            else if(i == n-1){
                min = Math.min(min, Math.abs(a[i] - a[i-1]));
                max = Math.max(max, Math.abs(a[i] - a[0]));     
            }
            else{
                min = Math.min(Math.abs(a[i] - a[i-1]), Math.abs(a[i]- a[i+1]));
                max = Math.max(Math.abs(a[i]- a[0]), Math.abs(a[i] - a[n-1]));    
            }
            System.out.println(min + " " + max);
            scn.close();
        }
    }
}
