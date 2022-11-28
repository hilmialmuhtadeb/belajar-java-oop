public class VehicleApp {

    public static void main(String[] args) {

        Car avanza = new Car(4, "automatic", 1100);
        System.out.println(avanza.startEngine());
        System.out.println(avanza.mentionSpecs());

        Motor vario = new Motor();
        System.out.println(vario.startEngine());

    }

}
