public class Homework5 {
    public static void main(String[] args) {
        int n = 1;
        while(n<=1000){
            long sum = 0;
            for(int i=1; i<n; ++i){
                if(n%i == 0){
                    sum += i;
                }
            }
            if(sum == n) System.out.print(n + " ");
            ++n;
        }
    }

    
}
