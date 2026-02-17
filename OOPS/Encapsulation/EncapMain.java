package OOPS.Encapsulation;

public class EncapMain {
    public static void main(String[] args) {
        EncapIntro obj = new EncapIntro();
        obj.doWork();

        Laptop l1 = new Laptop();
        l1.setprice(31);

        System.out.println(l1.getPrice());
    }
}

class Laptop {
        int ram;
        private int price;

        //getter/setter
        public void setprice(int price) {
            //is user an Admin
            //autherization
//            boolean isAdmin = false;
            boolean isAdmin=true;
            if (!isAdmin) {
                System.out.println("no access");
            } else {
                this.price = price;
            }
        }

        public int getRam(){
            return ram;
        }

        public void setRam(){
            this.ram=ram;
        }

        public int getPrice(){
            return price;
        }
}
