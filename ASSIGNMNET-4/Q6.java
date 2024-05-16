
import java.util.ArrayList;

public class Q6 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ArrayList<Object> objects = new ArrayList<>();
		try {
			while (true) {
				objects.add(new Object());
				if (System.currentTimeMillis() - startTime > 5000) {
					printMemoryUsage(startTime);
					startTime = System.currentTimeMillis();
				}
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Out of memory");
			printMemoryUsage(startTime);
		}
	}

	private static void printMemoryUsage(long startTime) {
		long totalMemory = Runtime.getRuntime().totalMemory();
		long freeMemory = Runtime.getRuntime().freeMemory();
		long usedMemory = totalMemory - freeMemory;
		System.out.println("Time Stamp : " + (System.currentTimeMillis() - startTime));
		System.out.println("Total Memory : " + totalMemory + "bytes");
		System.out.println("Free Memory : " + freeMemory + "bytes");
		System.out.println("Used Memory : " + usedMemory + "bytes");
	}
}
