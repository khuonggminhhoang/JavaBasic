import java.util.Scanner;

class MyTime{
    private int hour, minute, second;

    MyTime(){}

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d", this.hour) + ":" 
            + String.format("%02d", this.minute) + ":"
            + String.format("%02d", this.second);
    }

    public void nextSecond(){
        this.second += 1;
        if(this.second ==  60){
            this.second = 0;
            nextMinute();
        }
    }

    public void nextMinute(){
        this.minute += 1;
        if(this.minute == 60){
            this.minute = 0;
            nextHour();
        }
    }

    public void nextHour(){
        this.hour += 1;
        if(this.hour == 24){
            this.hour = 0;
        }
    }

    public void previousSecond(){
        this.second -= 1;
        if(this.second == -1){
            this.second = 59;
            previousMinute();
        }
    }

    public void previousMinute(){
        this.minute -= 1;
        if(this.minute == -1){
            this.minute = 59;
            previousHour();
        }
    }

    public void previousHour(){
        this.hour -= 1;
        if(this.hour == -1){
            this.hour = 23;
        }
    }
}

public class MyTime_Class {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String hhmmss = scn.nextLine();
        String[] arr = hhmmss.split(":");
        MyTime obj = new MyTime(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        obj.nextSecond();
        System.out.println(obj);
        obj.previousSecond();

        obj.nextMinute();
        System.out.println(obj);
        obj.previousMinute();

        obj.nextHour();
        System.out.println(obj);
        obj.previousHour();

        obj.previousSecond();
        System.out.println(obj);
        obj.nextSecond();

        obj.previousMinute();
        System.out.println(obj);
        obj.nextMinute();

        obj.previousHour();
        System.out.println(obj);
        obj.nextHour();

        scn.close();
    }
}
