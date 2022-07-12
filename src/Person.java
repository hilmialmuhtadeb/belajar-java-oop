public class Person {
    String name;
    byte age;
    final String country = "Indonesia";

    Person (String paramName) {
        name = paramName;
    }

    // constructor overloading
    Person () {

    }

    String sayHello (String paramName) {
        return "Hello " + paramName + "! My name is " + name + ". Nice to meet you!";
    }
}
