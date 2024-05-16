class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class Q2 {
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5.0, 8.0);

        System.out.println("Initial values - Length: " + myRectangle.getLength() +
                ", Width: " + myRectangle.getWidth());

        myRectangle.setLength(10.0);
        myRectangle.setWidth(7.0);

        System.out.println("Updated values - Length: " + myRectangle.getLength() +
                ", Width: " + myRectangle.getWidth());

        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
	}
}
