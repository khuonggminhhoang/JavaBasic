import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Teacher{
    private String teaCode;
    private String name;
    private String subject;

    Teacher(int cnt, String name, String subject){
        this.teaCode = "GV" + String.format("%02d", cnt);
        this.name = name;
        this.subject = subject;
    }

    public String simp(String s){
        String ans = "";
        String[] arr = s.split("\\s+");
        for(String x : arr){
            ans += Character.toUpperCase(x.charAt(0));
        }
        return ans;
    }

    public String firstName(){
        String[] arr = this.name.split("\\s+");
        return arr[arr.length-1];
    }

    public String getTeaCode(){
        return this.teaCode;
    }

    @Override
    public String toString(){
        return this.teaCode + " " + this.name + " " + simp(this.subject);
    }
}

public class sap_xep_giang_vien {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Teacher[] a = new Teacher[n];
        for(int i=0; i<n; ++i){
            a[i] = new Teacher(i+1, scn.nextLine(), scn.nextLine());
        }

        Arrays.sort(a, new Comparator <Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                if(!o1.firstName().equals(o2.firstName())){
                    return o1.firstName().compareTo(o2.firstName());
                }
                else{
                    return o1.getTeaCode().compareTo(o2.getTeaCode());
                }
            }
        
        });

        for(Object x : a){
            System.out.println(x);
        }
        
        scn.close();
    }
}
