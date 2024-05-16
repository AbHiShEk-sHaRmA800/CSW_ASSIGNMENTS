class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Q6 {
    TreeNode root;

    public Q6() {
        this.root = null;
    }

    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.val < min || node.val > max) {
            return false;
        }

        return isBSTUtil(node.left, min, node.val - 1) && isBSTUtil(node.right, node.val + 1, max);
    }

    public static void main(String[] args) {
        Q6 tree = new Q6();

        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);

        if (tree.isBST()) {
            System.out.println("The given binary tree is a Binary Search Tree.");
        } else {
            System.out.println("The given binary tree is not a Binary Search Tree.");
        }
    }
}
