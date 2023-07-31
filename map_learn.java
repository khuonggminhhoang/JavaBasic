import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map_learn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,5);
        map.put(3,8);
        map.put(2,13);
        System.out.println(map.size());
        // lấy ra entrySet
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        // duyệt từng phẩn tử trong entrySet
        for(Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        } 
    }
}

/*
 * HashMap:
 *      put(key,val) : Thêm cặp key, value vào map
 *      size() : trả về kích thước map
 *      isEmpty() : check map rỗng
 *      clear() : xóa các elements trong map
 *      containsKey(x) : kiểm tra sự tồn tại của x trong tập Key
 *      containsValue(x) : kiểm tra sự tồn tại của x trong tập Value
 *      get(x) : trả về value tương ứng với key x
 *      remove(x) : xóa cặp phần tử có key = x khỏi map
 *      replace(x,y) : thay thế cặp phần tử x,y
 */
