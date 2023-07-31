import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        boolean check = true;
        do{
            int n;
            n = new Scanner(System.in).nextInt();
            boolean flag = true;
            if(n == 1) flag = true;
            else
                for(int i=2; i<=Math.sqrt(n); ++i){
                    if(n%i == 0){
                        flag = false;
                        break;
                    }
                }
            if(flag == true) System.out.println(n + " is prime");
            else System.out.println(n + " isn't prime");

            System.out.println("Do you want to continue programe? (y/n)");
            char c = new Scanner(System.in).next().charAt(0);
            check = (c == 'y' ? true : false);
        }while(check);
    }
}
