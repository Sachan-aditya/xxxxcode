package trees;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeHelper {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            return buildTreeHelper(nodes);
        }

        private static Node buildTreeHelper(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTreeHelper(nodes);
            newNode.right = buildTreeHelper(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, -1, 2, 4, 7, 9, 0, 1, -1, -1};
        Node root = BinaryTreeHelper.buildTree(nodes);
        System.out.println(root.data);
    }
}