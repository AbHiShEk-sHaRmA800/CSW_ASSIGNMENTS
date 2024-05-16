public class Q4 {
	private String name;

	public Q4(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage collected: " + name);
	}

	public static void main(String[] args) {
		new Q4("Anonymous");
		System.gc();
	}

}
