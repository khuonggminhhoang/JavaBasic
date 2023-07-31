import java.util.*;

public class sort {
    public static int Sum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }
        
        Arrays.sort(a, new Comparator <Integer> (){
            public int compare(Integer o1, Integer o2){
                if((Sum(o1) < Sum(o2)) || (Sum(o1) == Sum(o2) && o1 > o2)){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for(int x : a){
            System.out.print(x + " ");
        }       
    }
}