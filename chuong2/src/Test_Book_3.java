import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Test_Book_3 {
    public static void main(String[] args) {
        Author_1 a1 = new Author_1("Tan Ah Teck", "nqc@gmail.com");
        System.out.println(a1);
        a1.setEmail("ngcuong@gmail.com");
        System.out.println(a1);
        System.out.println("name is : "+a1.getName());
        System.out.println("email is : "+a1.getEmail());
        Book_3 b1 = new Book_3("10000", "code java", a1, 9.9, 99);
        System.out.println(b1);
        b1.setPrice(8.8);
        b1.setQty(88);
        System.out.println(b1);
        System.out.println("isbn is : "+b1.getIsbn());
        System.out.println("name is : "+b1.getName());
        System.out.println("price is : "+b1.getPrice());
        System.out.println("qty is : "+b1.getQty());
        System.out.println("author is : "+b1.getAuthor1());
        System.out.println("author's name : "+b1.getAuthorName());
        System.out.println("author's name : "+b1.getAuthor1().getName());
        System.out.println("author's email : "+b1.getAuthor1().getEmail());
    }
}
