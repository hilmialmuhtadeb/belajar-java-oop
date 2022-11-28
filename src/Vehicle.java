class Vehicle {

    // field
    int wheels;
    String transmission;

    // constructor
    Vehicle(int wheels, String transmission) {
        // this keyword refers to current object
        this.wheels = wheels;
        this.transmission = transmission;
    }

    // constructor overloading
    Vehicle(int wheels) {
        this(wheels, null);
    }

    // default constructor (don't need any parameter)
    Vehicle() {
        this(0);
    }

    public String mentionSpecs() {
        return "This vehicle has " + this.wheels + " wheels. And the transmission is " + this.transmission + ".";
    }

    // method overloading
    public String mentionSpecs(String vehicleName) {
        return "This is " + vehicleName + ". " + this.mentionSpecs();
    }

    public String startEngine() {
        return "Default engine has been started. Brum brum..";
    }

}
