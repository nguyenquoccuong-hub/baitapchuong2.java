public class Test_Book_2 {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("cuong", "cuong@gmai.com", 'm');
        authors[1] = new Author("cuong nguyen", "nqc@gmai.com", 'm');
        authors[2] = new Author("nqc", "cuongit@gmail.com", 'm' );
        Book_2 book1 = new Book_2("code java", authors, 20, 100);
        System.out.println(book1);
    }
}
