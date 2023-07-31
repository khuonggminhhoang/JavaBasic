import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    private TreeSet <String> set;

    WordSet(){
        this.set = new TreeSet<>();
    }

    WordSet(String s){
        this.set = new TreeSet<>();
        s = s.toLowerCase();
        String[] arr = s.split("\\s+");
        for(String x : arr){
            this.set.add(x);
        }
    }

    public WordSet union(WordSet b){
        WordSet res = new WordSet();
        for(String x : this.set){
            res.set.add(x);
        }

        for(String x : b.set){
            if(!this.set.contains(x)){
                res.set.add(x);
            }
        }

        return res;
    }

    public WordSet intersection(WordSet b){
        WordSet res = new WordSet();
        for(String x : this.set){
            if(b.set.contains(x)){
                res.set.add(x);
            }
        }
        return res;
    }

    @Override
    public String toString(){
        String ans = "";
        for(String x : this.set){
            ans += x + " ";
        }
        return ans;
    }
}

public class lop_set_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
