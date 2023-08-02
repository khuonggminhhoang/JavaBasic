import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String code;
    private String name;
    private String birthday;
    private String address;
    
    Person(){};
    Person(String code , String name, String birthday, String address){
        this.code = code;
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

    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.birthday + " " + this.address;
    }
}

class Student extends Person{
    private double gpa;
    private String Class;

    Student(){}    
    Student(String code, String name, String birthday, String address, String Class, double gpa){
        super(code,name, birthday, address);
        this.Class = Class;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.Class + " " + String.format("%.2f", this.gpa);
    }
}

class Teacher extends Person{
    private String faculty;
    private int salary;
    private String Class;

    Teacher(){}
    Teacher(String code, String name , String birthday, String address, String faculty, int salary, String Class){
        super(code, name, birthday, address);
        this.faculty = faculty;
        this.salary = salary;
        this.Class = Class;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.faculty + " " + this.salary;
    }
}

public class truy_van_sing_vien_giao_vien {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        ArrayList <Student> arrStudent = new ArrayList<>();
        ArrayList <Teacher> arrTeacher = new ArrayList<>();
        while(n-->0){
            String code = scn.nextLine();
            String name = scn.nextLine();
            String birthday = scn.nextLine();
            String address = scn.nextLine();
            String s1 = scn.nextLine();
            String s2 = scn.nextLine();
            if(code.substring(0,2).equals("SV")){
                String Class = s1;
                double gpa = Double.parseDouble(s2);
                Student student = new Student(code, name, birthday, address, Class, gpa);
                student.standard();
                arrStudent.add(student); 
            }
            else{
                String Class = scn.nextLine();
                String faculty = s1;
                int salary = Integer.parseInt(s2);
                Teacher teacher = new Teacher(code, name, birthday, address, faculty, salary, Class);
                teacher.standard();
                arrTeacher.add(teacher);
            }
        }
        String query = scn.nextLine();
        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + query + " :");
        for(Teacher teacher : arrTeacher){
            if(teacher.getAddress().equals(query)){
                System.out.println(teacher);
            }
        }
        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + query + " :");
        for(Student student : arrStudent){
            if(student.getAddress().equals(query)){
                System.out.println(student);
            }
        }
    }
}