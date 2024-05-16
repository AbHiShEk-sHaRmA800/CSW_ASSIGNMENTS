
public class Q3 {
	private String name;

	public Q3(String name) {
		this.name = name;
	}

	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected: " + name);
		super.finalize();
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Q1 obj = new Q1("Object");
		obj = null;
		System.gc();
	}

}
