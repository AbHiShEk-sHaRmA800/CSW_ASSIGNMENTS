class Country {
	String name;
	int population;

	public Country(String name, int population) {
		this.name = name;
		this.population = population;
	}

	public String toString() {
		return name + " " + population;
	}

}

class BNode {
	Country info;
	BNode left;
	BNode right;

	public BNode(Country country) {
		this.info = country;
		this.left = null;
		this.right = null;
	}
}

class BST1 {
	BNode root;

	public BST1() {
		this.root = null;
	}

	public void insert(Country country) {
		root = insertNode(root, country);
	}

	private BNode insertNode(BNode root, Country country) {
		if (root == null) {
			root = new BNode(country);
			return root;
		}

		if (country.population < root.info.population) {
			root.left = insertNode(root.left, country);
		} else if (country.population > root.info.population) {
			root.right = insertNode(root.right, country);
		}

		return root;
	}

	public void levelOrderTraversal() {
		int height = getHeight(root);
		for (int i = 1; i <= height; i++) {
			printLevel(root, i);
		}
	}

	private int getHeight(BNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = getHeight(root.left);
			int rightHeight = getHeight(root.right);

			if (leftHeight > rightHeight) {
				return leftHeight + 1;
			} else {
				return rightHeight + 1;
			}
		}
	}

	private void printLevel(BNode root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.info.name + " ");
		} else if (level > 1) {
			printLevel(root.left, level - 1);
			printLevel(root.right, level - 1);
		}
	}

	public Country findMax() {
		BNode current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current.info;
	}

	public Country findMin() {
		BNode current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.info;
	}
}

public class Q3_Q4 {
	public static void main(String[] args) {
		BST1 bst = new BST1();
		bst.insert(new Country("USA", 33100));
		bst.insert(new Country("China", 14410));
		bst.insert(new Country("India", 13800));

		System.out.println("Level-order traversal:");
		bst.levelOrderTraversal();

		Country maxPopulationCountry = bst.findMax();
		System.out.println("\nCountry with maximum population: " + maxPopulationCountry.name);

		Country minPopulationCountry = bst.findMin();
		System.out.println("Country with minimum population: " + minPopulationCountry.name);
	}
}
