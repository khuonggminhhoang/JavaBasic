import java.util.Scanner;

public class chuyen_doi_in_hoa_in_thuong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char c = scn.nextLine().charAt(0);
        if( c >= 'a' && c <= 'z'){
            System.out.println((char) (c-32));
        }
        else{
            System.out.println((char) (c + 32));
        }
    }
}
