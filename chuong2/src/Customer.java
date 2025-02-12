public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer(int id, String name, int discount, char gender){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public Customer(int id, String name, int discount) {
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getDiscount(){
        return this.discount;
    }
    void setDiscount(int discount){
         this.discount = discount;
    }
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }
}
