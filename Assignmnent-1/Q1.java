class Car {
    private String make, model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Supra");
        Car myCar2 = new Car("Honda", "Accord"); // Set initial values for myCar2

        System.out.println("Initial values for myCar1: " + myCar1.getMake() + ", " + myCar1.getModel());
        System.out.println("Initial values for myCar2: " + myCar2.getMake() + ", " + myCar2.getModel());
    }
}
