import java.util.*;

public class _2241019447_Ass4_Q9_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to enter : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		printRepeatedElements(arr);
		sc.close();
	}

	static void printRepeatedElements(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> repeatedElement = new HashSet<>();
		for (int num : arr) {
			if (!set.add(num))
				repeatedElement.add(num);
		}
		Iterator<Integer> iter = repeatedElement.iterator();
		if (!repeatedElement.isEmpty()) {
			System.out.println("Repeated element : ");
			while (iter.hasNext())
				System.out.print(iter.next() + " ");
			System.out.println();
		}
	}
}