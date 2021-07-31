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

    public static <T> void PreOrderIterative(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        Deque<TreeNode<T>> st = new ArrayDeque<>();
        st.add(node);

        while (!st.isEmpty()) {
            TreeNode<T> current = st.pollLast();
            // Do ops
            System.out.print(current.data + " ");
            // End ops

            if (current.right != null) {
                st.add(current.right);
            }
            if (current.left != null) {
                st.add(current.left);
            }

        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNode.populate();

        System.out.print("PreOrder: ");
        PreOrderTraversal(root);

        System.out.print("\nPreOrderIterative: ");
        PreOrderIterative(root);

        System.out.print("\nInOrder: ");
        InOrder.InOrderTraversal(root);

        System.out.print("\nInOrderIterative: ");
        InOrder.InOrderIterative(root);

        System.out.print("\nPostOrder: ");
        PostOrder.PostOrderTraversal(root);

        System.out.print("\nBFS: ");
        BFS.levelOrderTraverse(root);
    }
}
