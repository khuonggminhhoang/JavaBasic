import java.util.Scanner;

public class While_loop {
    public static void main(String[] agrs){
        System.out.println("Nhập số nguyên trong khoảng 1 -> 99");
        int x;
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        while(x<0 || x >99){
            System.out.print("Nhập lại số: ");
            x = scn.nextInt();
        }
        System.out.printf("Số vừa nhập: %d\n",x);

        // tinh tong tu 1->5
        int a = 1;
        int sum = 0;
        do{
            sum += a;
            ++a;
        }
        while(a <=5);
        System.out.printf("Sum = %d",sum);
    }
}
