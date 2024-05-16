class Laptop {
	private String model;
	private double price;
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop Model: " + model + ", Price: $" + price;
	}
}

public class Q4 {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();

        lappy.setModel("Acer Aspire 7");
        lappy.setPrice(687.99);

        System.out.println(lappy);
	}

}
