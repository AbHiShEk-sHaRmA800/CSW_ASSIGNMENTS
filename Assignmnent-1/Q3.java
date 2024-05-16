class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
public class Q3 {

	public static void main(String[] args) {
		 Point point1 = new Point(3.0, 5.0);
	     System.out.println("Initial values - X: " + point1.getX() + ", Y: " + point1.getY());

	     Point point2 = new Point(point1);

	     point1.setX(8.0);
	     point1.setY(10.0);
	     
	     System.out.println("Modified values for point1 - X: " + point1.getX() + ", Y: " + point1.getY());

	     System.out.println("Values for point2 (copy) - X: " + point2.getX() + ", Y: " + point2.getY());
	}

}
