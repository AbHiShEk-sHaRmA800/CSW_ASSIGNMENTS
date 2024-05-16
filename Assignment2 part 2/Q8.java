import java.util.*;

public class _2241019447_Ass4_Q8_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (argrams(str1, str2)) {
			System.out.println("Strings are argrams");
		} else {
			System.out.println("Strings are not argrams");
		}
		sc.close();
	}

	public static boolean argrams(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for (char c : str1.toCharArray()) {
			if (charCountMap.containsKey(c)) charCountMap.put(c, charCountMap.get(c) + 1);
			else charCountMap.put(c, 1);
		}
		for (char c : str2.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) - 1);
				if (charCountMap.get(c) == 0) charCountMap.remove(c);
			} 
			else return false;
		}
		return charCountMap.isEmpty();
	}
}
