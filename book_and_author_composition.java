import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Author {
    private String name, email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email= email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return "Author Information :\n" + this.name + "\n" + this.email + '\n' + this.gender + "\n--------------------";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;                    // số lượng

    Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book Details :\n" + this.name + "\n" + String.format("%.0f", this.price) + "\n"
        + this.qty + "\n" + this.author;
    }

}

class sortBook implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPrice() != o2.getPrice()){
            if(o1.getPrice() > o2.getPrice()) return -1;
            else return 1;
        }
        else{
            return o1.getName().compareTo(o2.getName());
        }
    }
    
}

public class book_and_author_composition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        Book[] arr = new Book[n];

        for(int i=0; i<n; ++i){
            String nameBook = scn.nextLine();
            double priceBook = Double.parseDouble(scn.nextLine());
            int qtyBook = Integer.parseInt(scn.nextLine());
            Author author = new Author(scn.nextLine(), scn.nextLine(), scn.nextLine().charAt(0));
            arr[i] = new Book(nameBook, author, priceBook, qtyBook);
        }

        Arrays.sort(arr, new sortBook());
        for(Book x : arr){
            System.out.println(x);
        }
    }
}
