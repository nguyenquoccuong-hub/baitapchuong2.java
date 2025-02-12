public class Test_Book {
    public static void main(String[] args) {
        Author author = new Author("Nguyen Quoc CUong", "Cuong@gmai.com", 'm');
        System.out.println(author);
        Book book = new Book("code java ", author, 20 , 100);
        System.out.println(book);
        book.setPrice(30);
        book.setQty(200);
        System.out.println("name is = "+book.getName());
        System.out.println("price is = "+book.getPrice());
        System.out.println("qty is = "+book.getQty());
        System.out.println("Author is = "+book.getAuthor());
        System.out.println("Author's name is = "+book.getAuthor().getName());
        System.out.println("Author's name is = "+book.getAuthor().getEmail());
        Book book1 = new Book("more java ", new Author("cuong nguyen", "nqc@gmail.com",'m'),200 , 25);
        System.out.println(book1);
    }
}
