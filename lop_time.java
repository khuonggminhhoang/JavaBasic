import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Time{
    private int hour, min, sec;

    Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMin(){
        return this.min;
    }

    public int getSec(){
        return this.sec;
    }
    
    @Override
    public String toString(){
        return this.hour + " " + this.min + " " + this.sec;
    }
}

public class lop_time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Time[] a = new Time[n];
        for(int i=0; i<n; ++i){
            a[i] = new Time(scn.nextInt(), scn.nextInt(), scn.nextInt());
        } 
        Arrays.sort(a, new Comparator <Time>() {
            public int compare(Time o1, Time o2){
                if(o1.getHour() != o2.getHour()){
                    return o1.getHour() - o2.getHour();
                }
                else if(o1.getMin() != o2.getMin()){
                    return o1.getMin() - o2.getMin();   
                }
                else return o1.getSec() - o2.getSec();
            }
        });
        for(Time x : a){
            System.out.println(x);
        }
    }
}
