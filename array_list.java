import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; ++i){
            int x = scn.nextInt();
            arr.add(x);
        }

        for(int i=0; i<arr.size(); ++i){
            System.out.print( arr.get(i) + " ");
        }
        System.out.println();
        
        // arr.clear();
        if(arr.isEmpty()) System.out.println("empty");
        else System.out.println("not empty");

        System.out.println(arr.size());

        System.out.println(arr.contains(5));

        arr.remove(2);
        arr.remove((Object) 4);

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        // toArray()
        Object[] b = arr.toArray();
        for(Object x : b) System.out.print(x + " "); System.out.println();
        System.out.println(arr.indexOf(10));
        arr.forEach((x) -> System.out.print(x + " "));

        // Collections.sort(arr, comparator)
        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){
                if(o1 < o2) return -1;
                else return 1;
            }
        });
        for(int i=0; i<arr.size(); ++i){
            System.out.print(arr.get(i) + " ");
        }
    }
}

/*
 10
 5 2 3 4 1 9 7 8 6 10
 */
/*
 * ArrayList <Object> = new ArrayList<>();
 * chỉ lưu đc các object, ko lưu đc datatype nguyên thủy (int, long, char, double,...)
 * 
 * hàm add(obj) insert obj vào cuối mảng array list
 * hàm get(i) lấy gtri tại vị trí i của  array list
 * 
 * arr.size() : độ lớn của mảng arr
 * arr.add(obj) : thêm obj vào arr
 * arr.get(index) : truy xuất đến arr dựa vào chỉ số
 * arr.clear() : xóa mảng arr
 * arr.isEmpty() : check xem có rỗng hay ko
 * arr.contains(obj) : kiểm tra sự tồn tại của một gtri trong array list
 * arr.remove(index) : xóa một phần tử khỏi chỉ số index
 * arr.remove(obj) : xóa bỏ một đối tượng trong arr
 * arr.toArray() : trả về mảng chứa các Object tương tự như trongg array list
 * arr.indexOf(obj) : return chỉ số đầu tiên của obj nếu nó xuất hiện trong arrlist, return -1 nếu nó ko có gtri trong arrlist
 * Collections.sort(arr, [comparator]) : sắp xếp theo tiêu chí cmp.
 */

