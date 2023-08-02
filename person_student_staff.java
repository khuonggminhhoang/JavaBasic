import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    private String name;
    private String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Full Name : " + this.name + "\nAddress : " + this.address;
    }

}

class Student extends Person{
    private String program;
    private int year;
    private double fee;

    Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return this.program;
    }

    public void setProgram( String program){
        this.program = program;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee(){
        return this.fee;
    }

    public void setFee( double fee){
        this.fee = fee;
    }

    @Override
    public String toString(){
        return super.toString() + "\nProgram : " + this.program + "\nYear : " + this.year + "\nFee : " + String.format("%.0f", this.fee ) + " $" + "\n-----------------";
    }
}

class Staff extends Person{
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool(){
        return this.school;
    }

    public void setSchool( String school){
        this.school = school;
    }

    public double getPay(){
        return this.pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSchool : " + this.school
         + "\nPay : " + String.format("%.0f",this.pay) 
         + " $" + "\n-----------------";
    }
}

class studentSort implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getFee() != o2.getFee()){
            if(o1.getFee() > o2.getFee()) return -1;
            else return 1;
        }
        else return o1.getName().compareTo(o2.getName());
    }

}

class staffSort implements Comparator<Staff>{

    @Override
    public int compare(Staff o1, Staff o2) {
        if(o1.getPay() != o2.getPay()){
            if(o1.getPay() > o2.getPay()) return -1;
            else return 1;
        }
        else return o1.getName().compareTo(o2.getName());
    }

}

public class person_student_staff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.nextLine();
        Student[] arrStudents = new Student[n];
        Staff[] arrStaffs = new Staff[m];
        
        String trash = scn.nextLine();
        for(int i=0; i<n; ++i){
            String name = scn.nextLine();
            String address = scn.nextLine();
            String program = scn.nextLine();
            int year = scn.nextInt();
            int fee = scn.nextInt();
            scn.nextLine();
            arrStudents[i] = new Student(name, address, program, year, fee);
            trash = scn.nextLine();
        }

        for(int i=0; i<m; ++i){
            String name = scn.nextLine();
            String address = scn.nextLine();
            String school = scn.nextLine();
            int pay = scn.nextInt();
            scn.nextLine();
            arrStaffs[i] = new Staff(name, address, school, pay);
            trash = scn.nextLine();
        }

        Arrays.sort(arrStudents, new studentSort());
        Arrays.sort(arrStaffs, new staffSort());

        System.out.println("Student List :\n-----------------");
        for(Student student : arrStudents){
            System.out.println(student);
        }

        System.out.println("Staff List :\n-----------------");
        for(Staff staff : arrStaffs){
            System.out.println(staff);
        }
        scn.close();
    }
}

/*
5 9
-----------------
Philip Smith
PennsylvaniaRhode Island
Health Professions
4
131000
-----------------
Rick Williams
Wisconsin
Visual and Performing Arts
3
100000
-----------------
Benjamin Erickson
New Mexico
Engineering
1
110000
-----------------
Claude Anderson
Delaware
Business
1
135000
-----------------
Samuel Matthews
IllinoisIndiana
Health Professions
1
109000
-----------------
Ramon Wheeler
Iowa
Harvard
122000
-----------------
Dan Flores
North Carolina
Harvard
187000
-----------------
Dan Flores
Maryland
Harvard
192000
-----------------
Samuel Matthews
Georgia
Harvard
104000
-----------------
Aidan Simmons
IllinoisIndiana
Stanford
198000
-----------------
Liam Smith
New York
Harvard
178000
-----------------
Charlie Burns
North Dakota
Harvard
194000
-----------------
Conner Martin
Massachusetts
Stanford
139000
-----------------
Clark Green
Connecticut
Harvard
156000
-----------------
 */