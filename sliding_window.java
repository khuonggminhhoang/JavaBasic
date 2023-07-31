import java.util.*;

public class sliding_window {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        long maxSum = -1, sum = 0;
        for(int i=0; i<k; ++i){
            sum += a[i];
            maxSum = sum;
        }
        int ind = 0;
        for(int i=1; i<n-k+1; ++i){
            sum = sum - a[i-1] + a[i + k - 1];
            if(sum > maxSum){
                maxSum = sum;
                ind = i;
            }
        }
        System.out.println(maxSum);
        for(int i= ind ; i< ind + k; ++i){
            System.out.print(a[i] + " ");
        }
    }
}
/*
59 4
72 39 5 74 29 83 63 67 69 10 50 86 32 66 96 100 47 32 41 96 9 7 58 97 
87 26 21 23 100 52 31 76 43 74 17 72 104 40 99 8 16 27 38 78 69 46 16
58 73 52 49 67 62 42 64 28 46 34 83
*/