import java.util.Scanner;

public class ki_tu_ke_tiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if(c == 'z' || c == 'Z') System.out.println('a');
        else if( c >= 'a' && c < 'z') System.out.println( (char) (c + 1));
        else if( c >= 'A' && c < 'Z') System.out.println( (char) (c+ 33));
    }    
}
