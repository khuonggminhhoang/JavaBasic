import java.util.TreeSet;
import java.util.Scanner;

class IntSet {
    private TreeSet<Integer> set;

    IntSet(){
        this.set = new TreeSet<>();
    }

    IntSet(int[] a){
        this.set = new TreeSet<>();
        for(int x : a){
            this.set.add(x);
        }
    }

    public IntSet intersection( IntSet b){
        IntSet res = new IntSet();
        for(int x : this.set){
            if(b.set.contains(x)){
                res.set.add(x);
            }
        }
        return res;
    }

    public IntSet union( IntSet b){
        IntSet res = new IntSet();
        for(int x : this.set){
            res.set.add(x);
        }
        for(int x : b.set){
            if(!this.set.contains(x)){
                res.set.add(x);
            }
        }
        return res;
    }

    @Override
    public String toString(){
        String ans = "";
        for(int x : this.set){
            ans += x + " ";
        }
        return ans;
    }
}

public class lop_set_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; ++i) a[i] = scn.nextInt();
        for(int i=0; i<m; ++i) b[i] = scn.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
        scn.close();
    }
}
