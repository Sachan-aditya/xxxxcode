package trees;

import java.util.LinkedList;
import java.util.Queue;

public class raversal {
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

    // Preorder: root, left, right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder: left, root, right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder: left, right, root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left); // Changed from inorder to postorder
        postorder(root.right); // Changed from inorder to postorder
        System.out.print(root.data + " ");
    }

    // Level order: level wise
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node current = q.remove();
            if (current == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(current.data + " ");
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) { // Removed the else condition
                    q.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1,-1, 5, -1,-1, 3,-1,6,-1,-1};
        Node root = BinaryTreeHelper.buildTree(nodes);
        System.out.println("Root: " + root.data);
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println("\nInorder: ");
        inorder(root);
        System.out.println("\nPostorder: ");
        postorder(root);
        System.out.println("\nLevel Order: ");
        levelOrder(root);
    }
}