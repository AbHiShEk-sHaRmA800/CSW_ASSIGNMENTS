class Student {
	private String name;
	private int id;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	protected void finalize() {
		System.out.println("Student name " + name + " with id : " + id + " is grabage collected.");
	}
}

public class Q7 {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			@SuppressWarnings("unused")
			Student std = new Student("Student", i + 1);
		}
		long memoryUsage = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Memory used before grabage collection : " + memoryUsage);
		System.gc();
		long memoryUsageAfterGC = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Memory used after garbage collection : " + memoryUsageAfterGC);
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Time elapsed " + timeElapsed + " ms");
	}

}