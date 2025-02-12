import java.util.Arrays;

public class Book_2 {private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    public Book_2(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book_2(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
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
    public String toString(){
        return "Book[name = "+name+", "+ Arrays.toString(authors) +", price = "+price+", qty = "+qty+"]";
    }
    public String getAuthorNames(){
        String authorNames = "";
        for(int i=0; i < authors.length; i++){
            authorNames += authors[i].getName()+",";
        }
        return authorNames;
    }

}
