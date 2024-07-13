package trees;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "VALUE=" + data;
    }
}

public class bt {
    private TreeNode root;

    public bt() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode node, int value) {
        // If the tree is empty, return a new node
        if (node == null) {
            return new TreeNode(value);
        }

        // Otherwise, recur down the tree
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }

        // Return the (unchanged) node pointer
        return node;
    }

    // Method to print the tree in-order (for testing purposes)
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }

    public static void main(String[] args) {
        bt tree = new bt();
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);

        System.out.println("In-order traversal of the tree:");
        tree.inOrder();
    }
}
