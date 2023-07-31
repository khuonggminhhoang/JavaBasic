import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class comparator {
    public static int sumDigitEven(long n){
        int ans = 0;
        while(n!=0){
            if( (n%10)%2 == 0 ){
                ans++;
            }
            n/=10;
        }
        return ans;
    }

    public static int sumDigitOdd(long n){
        int ans = 0;
        while(n!=0){
            if( (n%10)%2 == 1 ){
                ans++;
            }
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Long[] a = new Long[n];
        Long[] tmpArr = new Long[n];

        for(int i=0; i<n; ++i) {
            a[i] = scn.nextLong();
            tmpArr[i] = a[i];
        }
        
        Arrays.sort(tmpArr, new Comparator <Long> (){
            public int compare(Long o1, Long o2){
                int x1 = sumDigitEven(o1), 
                    x2 = sumDigitEven(o2);
                if(x1 < x2){
                    return -1;
                }
                else if( x1 == x2){
                    if(o1 < o2) return -1;
                    else return 1;
                }
                else return 1;
            }
        });

        for(long x : tmpArr){
            System.out.print(x + " ");
        }
        System.out.println();

        Arrays.sort(a, new Comparator<Long>() {

            @Override
            public int compare(Long o1, Long o2) {
                int x1 = sumDigitOdd(o1), x2 = sumDigitOdd(o2);
                if(x1 < x2) return -1;
                else return 1;
            }
            
        });

        for(long x : a){
            System.out.print(x + " ");
        }
        scn.close();
    }
}
