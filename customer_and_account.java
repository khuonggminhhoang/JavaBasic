import java.util.Scanner;

class Customer{
    private int ID;
    private String name;
    private char gender;
    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }
    
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer ID : " + this.ID + "\nFull Name : " + this.name + "\nGender : " + this.gender;
    }
}

class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
   
    public Customer getCustomer() {
        return customer;
    }
    
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return this.customer.toString() + "\nAccount ID : " + this.id + "\nBalance : " + String.format("%.2f",this.balance) + " $";
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public void deposit(double amount){
        System.out.println("transaction successful");
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("transaction successful");
        }
        else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
    }
}

public class customer_and_account {
    public static String cutNumber(String s){
        String ans = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)  || x =='.'){
                ans += x;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line1 = scn.nextLine();
        String line2 = scn.nextLine();
        String line3 = scn.nextLine();
        String line4 = scn.nextLine();
        String line5 = scn.nextLine();
        int ID = Integer.parseInt(cutNumber(line1));
        String name = line2.substring(12);
        char gender = line3.charAt(line3.length() - 1);
         Customer customer = new Customer(ID, name, gender);
         int accID = Integer.parseInt(cutNumber(line4));
         double balance = Double.parseDouble(cutNumber(line5));
        Account acc = new Account(accID, customer, balance);

        String trash = scn.nextLine();
        int q = scn.nextInt();
        scn.nextLine();
        while(q-- > 0){
            String s = scn.next();
            if(s.equals("withdraw")){
                int money = Integer.parseInt(scn.next());
                acc.withdraw(money);
            }
            else{
                int money = Integer.parseInt(scn.next());
                acc.deposit(money);
            }
        }
        System.out.println("-------------------");
        System.out.println(acc);
    }
}
