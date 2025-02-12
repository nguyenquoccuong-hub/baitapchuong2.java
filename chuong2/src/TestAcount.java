public class TestAcount {
    public static void main(String[] args) {
        Customer1 c2 = new Customer1(10, "nguyen quoc cuong", 180326, 'm');
        System.out.println(c2);
        c2.setDiscount(1803);
        System.out.println(c2);
        System.out.println("id is : "+c2.getId());
        System.out.println("name is : "+c2.getName());
        System.out.println("discount is : "+c2.getDiscount());
        System.out.println("gender is : "+c2.getGender());
        Account a1 = new Account(10, c2, 60);
        System.out.println(a1);
        a1.setBalance(70);
        System.out.println(a1);
        System.out.println(a1.getCustomerName());
        System.out.println(a1.deposit(45));
        System.out.println(a1.withdraw(45));


    }
}
