import java.util.LinkedHashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        LinkedHashSet <Integer> lSet = new LinkedHashSet<>();
        while(n-->0){
            int x = scn.nextInt();
            lSet.add(x);
        } 
        for(Integer x : lSet){
            System.out.print(x + " ");
        }
    }
}

/*
 * HashSet
 * LinkedHashSet có các tính chất như HashSet nhưng có thứ tự phần tử đưa vào set
 * TreeSet có các tc như set trong C++
 * // floor(x) trả về phần tử lớn nhất <= x hoặc trả về null nếu ko tồn tại
 * // ceilling(x) trả về phần tử nhỏ nhất >= x hoặc trả về null nếu ko tồn tại
 * // first() return first element
 * // last() return last element
 * // lower(x)
 * // higher(x)
 * 
 * 
 * 
 */