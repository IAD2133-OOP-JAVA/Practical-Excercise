package Irfan.PRAC_LAB_3;

public class Phone {
    String model;
    double price;

    public Phone() {
        model = "Nothing";
        price = 0.0;
    }

    void checkPrice() {
        System.out.println("The " + model + " costs RM " + price);
    }

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.model = "iPhone 15";
        p1.price = 4999.00;
        p1.checkPrice();

        Phone p2 = new Phone();
        p2.model = "Samsung S24";
        p2.price = 4099.00;
        p2.checkPrice();
    }
}
