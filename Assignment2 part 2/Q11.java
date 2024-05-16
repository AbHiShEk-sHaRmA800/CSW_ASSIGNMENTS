import java.util.HashMap;

public class _2241019447_Ass4_Q11_Main {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 7, 10 };
		int res = findSmallestInt(arr);
		if(res == -1) System.out.println("No elements are missing from 1 - 10");
		else System.out.println("The smallest missing element : "+ res);
	}

	public static int findSmallestInt(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr)
			map.put(num, 1);
		for (int i = 1; i <= 10; i++) {
			if (!map.containsKey(i))
				return i;
		}
		return -1;
	}
}