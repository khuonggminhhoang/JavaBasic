import java.util.*;

public class day_so_uu_the {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int siz = 0;
        int cntEven = 0, cntOdd = 0;
        while(scn.hasNext()){
            int x = scn.nextInt();
            siz++;
            if(x%2 == 0){
                cntEven++;
            }
            else{
                cntOdd++;
            }
        }
        if((siz %2 == 0 && cntEven > cntOdd) || (siz%2 == 1 && cntOdd > cntEven )){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
