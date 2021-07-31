package problem_solving.tree_basics;

import java.util.ArrayDeque;
import java.util.Deque;

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

    public static <T> void InOrderIterative(TreeNode<T> node) {
        TreeNode<T> current = node;
        Deque<TreeNode<T>> st = new ArrayDeque<>();

        while (current != null || !st.isEmpty()) {

            while (current != null) {
                st.add(current);
                current = current.left;
            }

            current = st.pollLast();

            // Do ops
            System.out.println(current.data);

            current = current.right;
        }
    }
}
