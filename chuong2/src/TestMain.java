public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "nguyen quoc cuong", 10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is : "+ c1.getId());
        System.out.println("name is : "+c1.getName());
        System.out.println("discount is : "+c1.getDiscount());
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is : "+inv1.getId());
        System.out.println("customer is : "+inv1.getCustomer());
        System.out.println("customer's id is : "+inv1.getCustomerId());
        System.out.println("customer's name is : "+inv1.getCustomerName());
        System.out.println("customer's discount is : "+inv1.getCustomerDiscount());
        System.out.println("so tien con lai sau giam gia : "+inv1.getAmountAfterDiscount());
    }
}
