import java.util.Scanner;

public class mang_chan_le {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int chan = 0, le = 0;

        while(scn.hasNext()){
            int tmp = scn.nextInt();
            if(tmp%2 == 0) chan++;
            else le++;
        }
        if(chan > le) System.out.println("CHAN");
        else if( chan < le ) System.out.println("LE");
        else System.out.println("CHAN LE");
    }
}
