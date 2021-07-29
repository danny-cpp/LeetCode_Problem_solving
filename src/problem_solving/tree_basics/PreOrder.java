package problem_solving.tree_basics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class PreOrder {
    public static <T> void PreOrderTraversal(TreeNode<T> node) {
        if (node != null) {
            // Do ops
            System.out.print(node.data + " ");
            // End ops
            PreOrderTraversal(node.left);
            PreOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNode.populate();

        System.out.print("PreOrder: ");
        PreOrderTraversal(root);

        System.out.print("\nInOrder: ");
        InOrder.InOrderTraversal(root);

        System.out.print("\nPostOrder: ");
        PostOrder.PostOrderTraversal(root);

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
