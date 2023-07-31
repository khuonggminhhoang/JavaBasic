import java.util.Scanner;

public class chuan_hoa_ten_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] arr = s.split("\\s+");
        int sz = 0;
        for(String x : arr){
            StringBuilder sb = new StringBuilder("");
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1; i<x.length(); ++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            arr[sz] = sb.toString();
            sz++;
        }
        StringBuilder sb = new StringBuilder("");
        sb.append(arr[sz-1].charAt(0));
        for(int i=1; i < arr[sz-1].length(); ++i){
            sb.append(Character.toUpperCase(arr[sz-1].charAt(i)));
        }
        arr[sz-1] = sb.toString();
        
        for(int i=0; i<sz-2; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[sz-2] + ", " + arr[sz-1]);

        System.out.print(arr[sz-1] + ", ");
        for(int i=0; i<sz-1; ++i){
            System.out.print(arr[i] + " ");
        }
    }
}
