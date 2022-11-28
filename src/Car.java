class Car extends Vehicle {
    int engine;

    Car(int engine) {
        this(0, null, engine);
    }

    Car(int wheels, String transmission, int engine) {
        // super keyword refers to parent class
        super(wheels, transmission);
        this.engine = engine;
    }

    // overriding
    public String startEngine() {
        return this.engine + "cc engine has been started.";
    }

}