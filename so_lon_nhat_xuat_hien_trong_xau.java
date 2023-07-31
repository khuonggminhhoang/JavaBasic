import java.math.BigInteger;
import java.util.Scanner;

public class so_lon_nhat_xuat_hien_trong_xau {
    public static BigInteger findMaxNumber(String S) {
        String[] numbers = S.split("[^0-9]+"); 
    
        BigInteger maxNumber = new BigInteger("-1");
        for (String numStr : numbers) {
            if (!numStr.isEmpty()) {
                BigInteger num = new BigInteger(numStr);
                maxNumber = num.max(maxNumber);
            }
        }
    
        return maxNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        BigInteger maxNumber = findMaxNumber(S);
        System.out.println(maxNumber);
    }
}