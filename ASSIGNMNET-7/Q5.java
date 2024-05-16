class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinarySearchTree {
	Node root;

	public Node createNode(int[] arr, int st, int en) {
		if (st > en)
			return null;
		int mid = (st + en) / 2;
		Node n = new Node(arr[mid]);
		n.left = createNode(arr, st, mid - 1);
		n.right = createNode(arr, mid + 1, en);
		return n;
	}

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
}

public class Q5 {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int n = arr.length;

		tree.root = tree.createNode(arr, 0, n - 1);
		System.out.println("Inorder traversal ");
		tree.inOrder(tree.root);
	}
}