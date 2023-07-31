import java.util.*;

public class tan_suat_ky_tu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char minChar = 'z', maxChar = 'A';
        TreeMap<Character, Integer> map = new TreeMap<>();
        int n = scn.nextInt();
        scn.nextLine();

        while(n-- > 0){

            Character x = scn.next().charAt(0);
            maxChar = (char) Math.max(maxChar, x);
            minChar = (char) Math.min(minChar, x);
            if(map.containsKey(x) == true){
                int tmpVal = map.get(x);
                ++tmpVal;
                map.put(x,tmpVal);
            }
            else{
                map.put(x,1);
            }
        }
        System.out.println(minChar + " " + map.get(minChar));
        System.out.println();
        System.out.println(maxChar + " " + map.get(maxChar));
        System.out.println();

        Set <Map.Entry<Character, Integer>> entrySet = map.entrySet();
        List <Map.Entry<Character, Integer>> arr = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
            arr.add(entry);
        }
        System.out.println();
        Collections.reverse(arr);
        for(int i=0; i<arr.size(); ++i){
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
        scn.close();
    }
}
/*

20
E a q A z A F F A f G r r l p g D p n M

 */
