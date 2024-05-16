import java.util.*;

public class _2241019447_Ass4_Q6_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		Scanner sc = new Scanner(System.in);

		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(15);
		
		System.out.println("TreeSet elements: " + treeSet);

		System.out.print("Enter a number to search: ");
		int numberToSearch = sc.nextInt();
		System.out.println("Is " + numberToSearch + " present in the TreeSet? " + treeSet.contains(numberToSearch));

		System.out.print("Enter a number to remove: ");
		int numberToRemove = sc.nextInt();
		if (treeSet.remove(numberToRemove))
			System.out.println(numberToRemove + " removed successfully.");
		else
			System.out.println(numberToRemove + " not found in the TreeSet.");

		System.out.println("Updated TreeSet elements: " + treeSet);
		sc.close();
	}
}
