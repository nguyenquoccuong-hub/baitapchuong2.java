
    public class Customer1 {
        private int id;
        private String name;
        private int discount;
        private char gender;

        public Customer1(int id, String name, int discount, char gender){
            this.id = id;
            this.name = name;
            this.discount = discount;
            this.gender = gender;
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
        public char getGender(){
            return this.gender = gender;
        }
        public String toString(){
            return name+"("+id+")("+discount+"%)"+"'"+gender+"'";
        }
    }
