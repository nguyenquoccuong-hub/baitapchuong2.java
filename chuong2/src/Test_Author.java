public class Test_Author {
    public static void main(String[] args) {
        Author c1 = new Author("Nguyen Quoc Cuong", "cuongnq24it@vku.udn.vn", 'm');
        System.out.println(c1);
        c1.setEmail("nguyenquoccuong@gmai.com");
        System.out.println("name is = "+c1.getName());
        System.out.println("email is = "+c1.getEmail());
        System.out.println("gender is = "+c1.getGender());

    }


}
