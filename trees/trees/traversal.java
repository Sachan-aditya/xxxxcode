package trees;

import java.util.LinkedList;
import java.util.Queue;


public class traversal {
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

//preorder --root ,left,right
public static void preorder(Node root)
{
    if(root==null)
    return ;
System.out.print(root.data+"");
preorder(root.left);
preorder(root.right);
}
//inorder --left,root,right
public static void inorder(Node root)
{
    if(root==null)
    return;
    inorder(root.left);
    System.out.print(root.data+"");
    inorder(root.right);
}
//postorder-left right root
public static void postorder(Node root)
{

    if(root==null)
    return;
    inorder(root.left);
    inorder(root.right);
    System.out.print(root.data+"");
   
}
//level order --level wise
public static void Levelorder(Node root)
{
    if(root==null)
    return ;
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty())
    {
        Node current=q.remove();
        if(current==null)
        {
            System.out.println();
            if(q.isEmpty())
            break;
            else
            q.add(null);
        }
        else
        {
            System.out.println(current.data+"");
             if(current.left!=null)
             {
                q.add(current.left);
             }
             else
                {
                    if(current.right!=null)
                    {
                        q.add(current.right);
                    }
    } 
}
}
}
    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, -1, 2, 4, 7, 9, 0, 1, -1, -1};
        Node root = BinaryTreeHelper.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        inorder(root);
        postorder(root);
        Levelorder(root);
    }
}