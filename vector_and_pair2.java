import java.util.*;

public class vector_and_pair2 {
    private static final String ArrayList = null;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();

        for(int i=0; i<n; ++i){
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = scn.nextInt();
            arr.add(x + y + z);
        }
        for(Object x : arr){
            System.out.print(x + " ");
        }
    }
}
