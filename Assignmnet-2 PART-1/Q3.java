import java.util.Comparator;
class Car implements Comparable<Car> {
private String model;
private String color;
private int speed;
public Car(String model, String color, int speed) {
this.model = model;
this.color = color;
this.speed = speed;
}
public String getModel() {
return model;
}
public void setModel(String model) {
this.model = model;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public int getSpeed() {
return speed;
}
public void setSpeed(int speed) {
this.speed = speed;
}
public int compareTo(Car other) {
if (this.speed < other.speed) {
return 1;
} else if (this.speed > other.speed) {
return -1;
} else {
return 0;
}
}
public String toString() {
return "Car{" +"model='" + model + '\'' +", color='" + color + '\'' +", speed=" + speed +'}';
}
public static int compare(Car car1, Car car2) {
if (car1.speed < car2.speed) {
return 1;
} else if (car1.speed > car2.speed) {
return -1;
} else {
return 0;
}
}
}
public class Q3 {
public static void main(String[] args) {
Car car1 = new Car("Car1", "Red", 100);
Car car2 = new Car("Car2", "Blue", 120);
System.out.println("Car1: " + car1);
System.out.println("Car2: " + car2);
int comparisonResult = Car.compare(car1, car2);
if (comparisonResult < 0) {
System.out.println("Car1 has a greater speed than Car2");
} else if (comparisonResult > 0) {
System.out.println("Car2 has a greater speed than Car1");
} else {
System.out.println("Both cars have the same speed");
}
}
}