import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Items{
    private String itemCode;
    private String nameItem;
    private String unit;
    private int purcharseCost;
    private int sellCost;

    public static int cnt = 0;

    Items(String nameItem, String unit, int purcharseCost, int sellCost){
        cnt++;
        this.nameItem = nameItem;
        this.unit = unit;
        this.purcharseCost = purcharseCost;
        this.sellCost = sellCost;
        this.itemCode = "MH" + String.format("%04d", cnt);
    }

    public int getProfit(){
        return this.sellCost - this.purcharseCost;
    }

    public String getCode(){
        return this.itemCode;
    }

    @Override
    public String toString() {
        return this.itemCode + " " + this.nameItem + " " + this.unit
                + " " + this.purcharseCost + " " + this.sellCost + " "
                + this.getProfit();
    }
    
}

public class danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Items[] a = new Items[n];

        for(int i=0; i<n; ++i){
            scn.nextLine();
            a[i] = new Items(scn.nextLine(), scn.nextLine(), scn.nextInt(), scn.nextInt());
        }

        Arrays.sort(a, new Comparator<Items>() {

            @Override
            public int compare(Items o1, Items o2) {
                if(o1.getProfit() != o2.getProfit()){
                    return o2.getProfit() - o1.getProfit();
                }
                else 
                    return o1.getCode().compareTo(o2.getCode());
            }
        });

        for(int i=0; i<n; ++i){
            System.out.println(a[i]);
        }
    }
}