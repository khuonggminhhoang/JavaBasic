import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        long sum = 0;
        for(int i=1; i<=n; ++i){
            if(i == 3) continue;    // lệnh continue như bên C++, tiếp tục vòng lặp
            sum +=i;
            if(i == 10) break;      // lệnh break thoát khỏi vòng lặp đầu tiên chứa nó
        }
        System.out.println("Sum = " + sum);
    }
}
