package plants;

public class PolymorphismApp {

    public static void main(String[] args) {

        sayName(new Plant("Pohon Beringin"));
        sayName(new Fruit("Mangga"));
        sayName(new Fruit("Apel"));
        sayName(new Apple("Apel Hijau"));

    }

    static void sayName(Plant plant) {
        // melakukan pengecekan supaya tidak terjadi error ketika casting (konversi) tipe data
        if (plant instanceof Apple) {
            // konversi tipe data
            Apple apple = (Apple) plant;
            System.out.println("Ini adalah apel varietas " + apple.name);
        } else if (plant instanceof Fruit) {
            Fruit fruit = (Fruit) plant;
            System.out.println("Ini adalah pohon dari buah " + fruit.name);
        } else {
            System.out.println("Ini adalah tanaman " + plant.name);
        }
    }

}
