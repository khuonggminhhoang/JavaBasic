import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String code, name, birthday, address;

    Person(){}
   
    Person(String code, String name, String birthday, String address){
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
            st.insert(0, '0');
        }
        if(st.charAt(4) == '/'){
            st.insert(3,'0');
        }
        this.birthday = st.toString();
    }

    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.birthday + " " + this.address;
    }
}

class Student extends Person{
    private String Class;
    private double gpa;

    Student(){}

    Student(String code, String name, String birthday, String address, String Class, double gpa){
        super(code, name, birthday, address);
        this.Class = Class;
        this.gpa = gpa;
    }

    public String getClass1(){
        return this.Class;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.Class + " " + String.format("%.2f", this.gpa);
    }
}

class Lecturer extends Person{
    private String faculty;
    private String Class;
    private int salary;

    Lecturer(){}

    Lecturer(String code, String name, String birthday, String address, String faculty, int salary, String Class){
        super(code, name, birthday, address);
        this.faculty = faculty;
        this.salary = salary;
        this.Class = Class;
    }

    public String getClass1(){
        return this.Class;
    } 

    @Override
    public String toString(){
        return super.toString() + " " + this.faculty + " " + this.salary + " " + this.Class;
    }
}


public class giao_vien_chu_nhiem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        ArrayList <Student> arrStudent = new ArrayList<>();
        ArrayList <Lecturer> arrLecturer = new ArrayList<>();

        while(n-- > 0){
            String code = scn.nextLine();
            String name = scn.nextLine();
            String birthday = scn.nextLine();
            String address = scn.nextLine();

            if(code.substring(0,2).equals("SV")){
                String Class = scn.nextLine();
                double gpa = Double.parseDouble(scn.nextLine());
                Student student = new Student(code, name, birthday, address, Class, gpa);
                student.standard();
                arrStudent.add(student);
            }
            else{
                String faculty = scn.nextLine();
                int salary = Integer.parseInt(scn.nextLine());
                String Class = scn.nextLine();
                Lecturer lecturer = new Lecturer(code, name, birthday, address, faculty, salary, Class);
                lecturer.standard();
                arrLecturer.add(lecturer);
            }
        }

        String query = scn.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP " + query + " :");
        for(Lecturer x : arrLecturer){
            if(x.getClass1().equals(query)){
                System.out.println(x);
            }
        }
        System.out.println("DANH SACH SINH VIEN LOP " + query + " :");
        for(Student x : arrStudent){
            if(x.getClass1().equals(query)){
                System.out.println(x);
            }
        }
    }
}


/*
8
GV1
Nguyen VAn TuaN
6/2/1975
Nam Dinh
DTVT
25000000
CNTT1
SV2
Vu AnH MaNH
13/10/2004
Ha Noi
DTVT1
2.70
SV3
trAN Phuong TuaN
5/9/2004
Hai Duong
ATTT3
2.80
GV4
trAN duC HaI
14/12/1973
Ha Nam
Co khi
25000000
CNTT2
SV5
Nguyen Ngoc TuaN
13/11/2004
Hai Duong
CNTT1
3.05
SV6
Luong duC LoNG
6/1/2004
Hai Duong
CNTT2
2.70
GV7
Nguyen Phuong TuaN
25/4/1974
Nam Dinh
Co khi
12000000
DTVT1
SV8
Luong duC NAM
3/2/2004
Ha Noi
CNTT1
2.50
CNTT1
 */
