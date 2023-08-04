import java.util.Arrays;
import java.util.Scanner;

class Author {
    private String name, email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\nEmail : " + this.email + "\nGender : " + this.gender;
    }
}

class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames(){
        String ans = "Author information :";
        for(int i=0; i< authors.length; ++i){
            ans += "\n#" + (i+1) + "\n" + authors[i].toString();
        }
        return ans;
    }

    @Override 
    public String toString() {
        return "-----------------------"
        + "\nBook information :"
        + "\nName : " + this.name
        + "\nPrice : " + String.format("%.0f", this.price)
        + "\nQuantity : " + this.qty
        + "\n" + getAuthorNames();
    }
}

public class book_and_authors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String trash = scn.nextLine();
        Book[] arrBook = new Book[n];
        for(int i=0; i<n; ++i){
            String name = scn.nextLine();
            double price = scn.nextDouble();
            int qty = scn.nextInt();
            int m = scn.nextInt();
            scn.nextLine();
            Author[] authors = new Author[m];
            for(int j = 0; j<m; ++j){
                authors[j] = new Author(scn.nextLine(), scn.nextLine(), scn.nextLine().charAt(0));
            }
            arrBook[i] = new Book(name, authors, price, qty);
            trash = scn.nextLine();
        }
        for(Book x : arrBook){
            System.out.println(x);
        }
    }
}
