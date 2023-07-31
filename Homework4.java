public class Homework4 {
    public static void main(String[] args) {
        int n = 1;
        long sum = 0;
        while(n<=10){
            long Temp = 1;
            for(int i=1; i<=n; ++i){
                Temp *= i;
            }
            sum += Temp;
            ++n;
        }
        System.out.println(sum);
    }
}
