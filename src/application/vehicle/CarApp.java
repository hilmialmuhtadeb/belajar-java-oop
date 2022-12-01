package application.vehicle;

public class CarApp {
    public static void main(String[] args) {

        Car avanza = new Car("Toyota", 4);
        avanza.startEngine();
        avanza.mentionSpecs();

        avanza.setWheel(3);
        avanza.mentionSpecs();

    }
}
