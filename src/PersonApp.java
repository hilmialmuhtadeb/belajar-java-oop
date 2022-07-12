public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Hilmi Almuhtade Billah";
        person1.age = 20;

        // instance class with overloaded constructor
        Person person2 = new Person("Dzakiya");

        System.out.println(person1.sayHello("Dzakiya"));
        System.out.println(person2.sayHello("Hilmi"));
    }
}
