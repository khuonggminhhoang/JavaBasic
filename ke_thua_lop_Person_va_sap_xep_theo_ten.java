import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    protected String name;
    protected String birthday;
    protected String address;
    
    Person(){};
    Person(String name, String birthday, String address){
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public void standard(){
        StringBuilder sb = new StringBuilder("");
        String[] arr = this.name.split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1; i<x.length(); ++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.name = sb.toString();

        StringBuilder st = new StringBuilder(this.birthday);
        if(st.charAt(1) == '/'){
            st.insert(0,'0');
        }
        if(st.charAt(4) == '/'){
            st.insert(3,'0');
        }
        this.birthday = st.toString();
    }

    @Override
    public String toString(){
        return this.name + " " + this.birthday + " " + this.address;
    }
}

class Student extends Person{
    private String msv;
    private double gpa;
    private String Class;

    Student(){}    
    Student(int cnt, String name, String birthday, String address, String Class, double gpa){
        super(name, birthday, address);
        this.msv = String.format("%04d", cnt);
        this.Class = Class;
        this.gpa = gpa;
    }

    public String getName(){
        String[] arr = this.name.split("\\s+");
        return arr[arr.length - 1];
    }

    public String getMsv(){
        return this.msv;
    }

    public String getSortedName(){
        String[] arr = this.name.split("\\s+");
        String res = arr[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            res += arr[i];
        }
        return res;
    }

    @Override
    public String toString(){
        return this.msv + " " + super.toString() + " " + this.Class + " " + String.format("%.2f", this.gpa);
    }
}

public class ke_thua_lop_Person_va_sap_xep_theo_ten {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Student[] a = new Student[n];
        for(int i=0; i<n; ++i){
            scn.nextLine();
            a[i] = new Student(i+1, scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextDouble());
            a[i].standard();
        }
        Arrays.sort(a, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSortedName().compareTo(o2.getSortedName());
            }
            
        });

        for(Object x : a){
            System.out.println(x);
        }
    }
}
