import java.util.*;

class Car implements Comparable<Car> {
	private int modalNo;
	private String name;
	private int stock;

	public Car(int modalNo, String name, int stock) {
		this.modalNo = modalNo;
		this.name = name;
		this.stock = stock;
	}

	public int getModalNo() {
		return modalNo;
	}

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public int compareTo(Car car) {
		return Integer.compare(this.stock, car.stock);
	}
}

public class _2241019447_Ass4_Q3_CarApp {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car(2013, "Creta", 10));
		cars.add(new Car(2020, "MG", 13));
		cars.add(new Car(2018, "Kia", 20));
		cars.add(new Car(2015, "BMW", 55));
		cars.add(new Car(2017, "Audi", 45));
		Collections.sort(cars);
		for (Car car : cars) 
			System.out.println(car.getModalNo() + " " + car.getName() + " " + car.getStock());
	}

}
