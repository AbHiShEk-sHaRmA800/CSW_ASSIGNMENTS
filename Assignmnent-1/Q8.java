package question8;
interface Vehicle {
    void accelerate();
    void brake();
}

class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at " + speed + " km/h for " + duration + " seconds.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is pedaling faster.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is applying brakes.");
    }

    public void accelerate(int pedalSpeed) {
        System.out.println("Bicycle is pedaling at " + pedalSpeed + " rpm.");
    }

    public void accelerate(int pedalSpeed, int duration) {
        System.out.println("Bicycle is pedaling at " + pedalSpeed + " rpm for " + duration + " seconds.");
    }
}

public class Main_2241019447_Ass2_Q8 {

	public static void main(String[] args) {
		 Car myCar = new Car();
	     Bicycle myBicycle = new Bicycle();

	     myCar.accelerate();
	     myCar.brake();

	     myBicycle.accelerate();
	     myBicycle.brake();

	     myCar.accelerate(80);
	     myCar.accelerate(100, 10);

	     myBicycle.accelerate(20);
	     myBicycle.accelerate(30, 5);
	}

}
