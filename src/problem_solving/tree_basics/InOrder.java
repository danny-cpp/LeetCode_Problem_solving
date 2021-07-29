package problem_solving.tree_basics;

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
}
