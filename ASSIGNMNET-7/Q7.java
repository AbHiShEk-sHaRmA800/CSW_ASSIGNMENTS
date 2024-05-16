class Node1 {
	int key;
	Node1 left, right;

	public Node1(int item) {
		key = item;
		left = right = null;
	}
}

public class Q7 {

	static Node1 root;

	Q7() {
		root = null;
	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	static void inorder(Node1 root2) {
		if (root2 != null) {
			inorder(root2.left);
			System.out.print(root2.key + " ");
			inorder(root2.right);
		}
	}

	Node1 deleteRec(Node1 root, int key) {
		if (root == null)
			return root;

		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.key = minValue(root.right);

			root.right = deleteRec(root.right, root.key);
		}

		return root;
	}

	int minValue(Node1 root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	public static void main(String[] args) {
		Q7 tree = new Q7();
		tree.root = new Node1(4);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(5);
		tree.root.left.left = new Node1(1);
		tree.root.left.right = new Node1(3);

		System.out.println("Inorder traversal of the given tree");
		tree.inorder(tree.root);

		System.out.println("\nDelete 2");
		tree.deleteKey(2);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);
	}
}
