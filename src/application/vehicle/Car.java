package application.vehicle;

public class Car implements Vehicle {

    private String brand;
    private int wheel;

    public void startEngine() {
        System.out.println("Brum brum...");
    }

    public void mentionSpecs() {
        System.out.println("Brand: " + this.brand + ". Wheels: " + this.wheel);
    }

    Car(String brand, int wheel) {
        this.brand = brand;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

}
