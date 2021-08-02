package problem_solving.tree_basics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InOrder {
    public static <T> void InOrderTraversal(TreeNode<T> node) {
        if (node != null) {
            InOrderTraversal(node.left);
            // Do ops
            System.out.print(node.data + " ");
            // End ops
            InOrderTraversal(node.right);
        }
    }

    public static <T> void InOrderIterative1(TreeNode<T> node) {
        TreeNode<T> current = node;
        Deque<TreeNode<T>> st = new ArrayDeque<>();

        while (current != null || !st.isEmpty()) {

            while (current != null) {
                st.add(current);
                current = current.left;
            }

            current = st.pollLast();

            // Do ops
            System.out.print(current.data + " ");
            // End ops

            current = current.right;
        }
    }

    public static <T> void InOrderIterative2(TreeNode<T> node) {
        TreeNode<T> current = node;
        Deque<TreeNode<T>> st = new ArrayDeque<>();

        while (current != null || !st.isEmpty()) {

            if (current != null) {
                st.add(current);
                current = current.left;
            }
            else {
                current = st.pollLast();

                // Do ops
                System.out.print(current.data + " ");
                // End ops

                current = current.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNode.populate();

        System.out.print("\nInOrderIterative2: ");
        long d1 =  System.nanoTime();
        InOrder.InOrderIterative2(root);
        long d2 = System.nanoTime();
        long res2 = d2 - d1;
        System.out.println(res2);

        System.out.print("InOrderIterative1: ");
        long s1 = System.nanoTime();
        InOrder.InOrderIterative1(root);
        long s2 = System.nanoTime();
        long res1 = s2 - s1;
        System.out.println(res1);

    }
}
