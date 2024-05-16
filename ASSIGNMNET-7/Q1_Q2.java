class BSTNode {
	int info;
	BSTNode left, right;

	public BSTNode(int info) {
		this.info = info;
		left = right = null;
	}
}

class BST {
	BSTNode root;

	public BST() {
		this.root = null;
	}

	public void insert(int info) {
		root = insertNode(root, info);
	}

	private BSTNode insertNode(BSTNode root, int info) {
		if (root == null) {
			root = new BSTNode(info);
			return root;
		}

		if (info < root.info) {
			root.left = insertNode(root.left, info);
		} else if (info > root.info) {
			root.right = insertNode(root.right, info);
		}

		return root;
	}

	public void preOrderTraversal() {
		preOrder(root);
	}

	private void preOrder(BSTNode root) {
		if (root != null) {
			System.out.print(root.info + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrderTraversal() {
		inOrder(root);
	}

	private void inOrder(BSTNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.info + " ");
			inOrder(root.right);
		}
	}

	public void postOrderTraversal() {
		postOrder(root);
	}

	private void postOrder(BSTNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.info + " ");
		}
	}
}

public class Q1_Q2 {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(50);
		bst.insert(30);
		bst.insert(70);
		bst.insert(20);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);

		System.out.println("Pre-order traversal:");
		bst.preOrderTraversal();
		System.out.println("\nIn-order traversal:");
		bst.inOrderTraversal();
		System.out.println("\nPost-order traversal:");
		bst.postOrderTraversal();
	}
}
