import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Gammer {
    private String username;
    private String password;
    private String name;
    private String timeIn;
    private String timeOut;

    Gammer(String username, String password, String name, String timeIn, String timeOut){
        this.username = username;
        this.password = password;
        this.name = name;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public int timeOnl(){
        int h1 = Integer.parseInt(this.timeIn.substring(0,2)) * 60 + 
                Integer.parseInt(this.timeIn.substring(3));
        int h2 = Integer.parseInt(this.timeOut.substring(0,2)) * 60 + 
                Integer.parseInt(this.timeOut.substring(3));
        return h2 - h1;
    }

    public String convTime(int num){
        String ans = "";
        ans += num/60 + " gio " + num%60 + " phut";
        return ans;
    }

    public String getUsername(){
        return this.username;
    }
    
    @Override
    public String toString() {
        return this.username + " " + this.password + " " + this.name + " "
                + convTime(timeOnl());
    }

}

public class tinh_gio_quan_net {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Gammer[] a = new Gammer[n];
        for(int i=0; i<n; ++i){
            a[i] = new Gammer(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
        }
        Arrays.sort(a, new Comparator <Gammer>(){
            @Override
            public int compare(Gammer o1, Gammer o2) {
                if(o1.timeOnl() != o2.timeOnl()){
                    return o2.timeOnl() - o1.timeOnl();
                }
                else{
                    return o1.getUsername().compareTo(o2.getUsername());
                }
            }
            
        });

        for(Object x : a){
            System.out.println(x);
        }
        scn.close();
    }
}
