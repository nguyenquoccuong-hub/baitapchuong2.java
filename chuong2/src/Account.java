public class Account {
    private int id;
    private Customer1 customer;
    private double balance=0.0;

    public Account(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer1 customer){
        this.id = id;
        this.customer = customer;
    }
    public int getId(){
        return id;
    }
    public Customer1 getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        return customer.getName()+"("+id+")balance = "+balance;
    }
    public String getCustomerName(){
        return getCustomer().getName();
    }
    public Account deposit(double amount){
        if(amount>0){
            this.balance += amount;
        }
        else {
            System.out.println("khong hop le");
        }
        return this;
    }
    public Account withdraw(double amount){
        if(amount <= balance){
            this.balance -= amount;
        }
        else {
            System.out.println("khong hop le");
        }
        return this;
    }
}
