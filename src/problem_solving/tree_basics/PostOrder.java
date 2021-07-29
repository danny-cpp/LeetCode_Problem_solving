package problem_solving.tree_basics;

public class PostOrder {
    public static <T> void PostOrderTraversal(TreeNode<T> node) {
        if (node != null) {
            PostOrderTraversal(node.left);
            PostOrderTraversal(node.right);
            // Do ops
            System.out.print(node.data + " ");
            // End ops
        }
    }
}
