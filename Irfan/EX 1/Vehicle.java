public class Vehicle {
    String brand;
    int speed;

    public Vehicle() {
        brand = "Unknown";
        speed = 0;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + System.lineSeparator() + "Speed: " + speed + " km/h" + System.lineSeparator());
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.speed = 120;
        v1.showDetails();

        Vehicle v2 = new Vehicle();
        v2.brand = "Honda";
        v2.speed = 150;
        v2.showDetails();
    }
}
