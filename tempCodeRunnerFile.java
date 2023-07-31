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

    @Override
    public String toString() {
        return this.itemCode + " " + this.nameItem + " " + this.unit
                + " " + this.purcharseCost + " " + this.sellCost + " "
                + getProfit();
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
                else return 1;
            }
        });

        for(int i=0; i<n; ++i){
            System.out.println(a[i]);
        }
    }
}

/*
6
Ca phe
Thung
388000
492000
Dep
Thung
388000
492000
Giay Nguoi Lon
Cai
389000
580000
Giay Nguoi Lon
Thung
383000
503000
Dep
Thung
484000
647000
Vay Nu
Cai
366000
516000
 */