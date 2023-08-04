import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Customer {
    private int id;
    private String name;
    private int discount;

    Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer ID : " + this.id + "\nFull Name : " + this.name;
    }
}

class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID(){
        return this.customer.getId();
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public int getCustomerDiscount(){
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return this.amount *1d * (100 - this.getCustomerDiscount())/ 100;
    }

    @Override
    public String toString() {
        return this.customer.toString() + "\nAmount : " + String.format("%.2f", this.getAmountAfterDiscount()) + " $\n--------------------" ;
    }

}

class sortCustomer implements Comparator<Invoice>{

    @Override
    public int compare(Invoice o1, Invoice o2) {
        if(o1.getAmountAfterDiscount() != o2.getAmountAfterDiscount()){
            if(o1.getAmountAfterDiscount() > o2.getAmountAfterDiscount()) return -1;
            else return 1;
        }
        else{
            return o1.getCustomerID() - o2.getCustomerID();
        }
    }

}

public class Customer_Invoice {
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
        int n = scn.nextInt(); 
        scn.nextLine();
        String trash = scn.nextLine();
        Invoice[] arr = new Invoice[n];

        for(int i=0; i<n; ++i){
            String line1 = scn.nextLine();
            String line2 = scn.nextLine();
            String line3 = scn.nextLine();
            String line4 = scn.nextLine();
            String line5 = scn.nextLine();
            Customer customer = new Customer(Integer.parseInt(cutNumber(line1)), line2.substring(12), Integer.parseInt(cutNumber(line3)));
            arr[i] = new Invoice(Integer.parseInt(cutNumber(line4)), customer, Double.parseDouble(cutNumber(line5)));
            trash = scn.nextLine();
        }

        Arrays.sort(arr, new sortCustomer());

        for(Invoice x : arr){
            System.out.println(x);
        }
        
        scn.close();
    }
}