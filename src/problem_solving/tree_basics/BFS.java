package problem_solving.tree_basics;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {
    public static <T> void levelOrderTraverse(TreeNode<T> root) {
        TreeNode<T> tmp = root;
        Deque<TreeNode<T>> q = new ArrayDeque<>();

        while (tmp != null) {
            // Do ops
            System.out.print(tmp.data + " ");
            // End ops

            if (tmp.left != null) {
                q.add(tmp.left);
            }
            if (tmp.right != null) {
                q.add(tmp.right);
            }

            if (!q.isEmpty()) {
                tmp = q.poll();
            }
            else {
                return;
            }
        }
    }
}
