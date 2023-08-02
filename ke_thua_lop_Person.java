import java.util.Scanner;

class Person{
    private String name;
    private String birthday;
    private String address;
    
    Person(){}

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
        sb.deleteCharAt(sb.length()-1);
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

    Student(int cnt, String name, String birthday, String address, String Class, double gpa){
        super(name, birthday, address);
        this.msv = String.format("%04d", cnt);
        this.Class = Class;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return this.msv + " " + super.toString() + " " + this.Class + " " + String.format("%.2f", this.gpa);
    }

}

public class ke_thua_lop_Person {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; ++i){
            scn.nextLine();
            String name = scn.nextLine();
            String s = scn.nextLine();
            String Class = scn.nextLine();
            double gpa = scn.nextDouble();
            String birthday = "";
            String address = "";
            for(char x : s.toCharArray()){
                if(Character.isDigit(x) || x == '/'){
                    birthday += x;
                }
                else{
                    address += x;
                }
            }
            Student a = new Student(i+1, name, birthday, address, Class, gpa);
            a.standard();
            System.out.println(a);
        }
        scn.close();
    }
}
