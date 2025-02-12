import java.util.Arrays;

public class Book_3 {
    private String isbn;
    private String name;
    private Author_1 author1;
    private double price;
    private int qty = 0;
    public Book_3 (String isbn, String name, Author_1 author1, double price){
        this.isbn = isbn;
        this.name = name;
        this.author1 = author1;
        this.price = price;
    }
    public Book_3 (String isbn, String name, Author_1 author1, double price, int qty){
        this.isbn = isbn;
        this.name = name;
        this.author1 = author1;
        this.price = price;
        this.qty = qty;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getName(){
        return name;
    }
    public Author_1 getAuthor1(){
        return author1;
    }
    public double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    void setQty(int qty){
        this.qty = qty;
    }
    public String getAuthorName(){
        return author1.getName();
    }
    public String toString(){
        return "Book[isbn = "+isbn +", name = "+name +", "+ author1 +", price = "+price +", qty = "+qty+"]";
    }


}