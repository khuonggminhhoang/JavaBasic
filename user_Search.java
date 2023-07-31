import java.util.Scanner;

public class user_Search {
    public static void main( String[] agrs){
        System.out.println("\t  --MENU--");
        System.out.println("1. Tim theo ten");
        System.out.println("2. Tim theo tac gia");        
        System.out.println("3. Tim theo NSX");
        System.out.println("4. Tim theo tieu de");
        System.out.println("Phim nhap khong hop le");
        
        int select;
        Scanner  scn = new Scanner(System.in);
        select = scn.nextInt();
        scn.close();
        switch(select){
            case 1: {
                System.out.println("Tim theo ten");
                break;
            }
            case 2: {
                System.out.println("Tim theo tac gia");
                break;
            }
            case 3: {
                System.out.println("Tim theo NSX");
                break;
            }
            case 4: {
                System.out.println("Tim theo tieu de");
                break;
            }
            default: {
                System.out.println("Phim nhap sai");
                break;
            }
        }
    }
}
