package problem_solving.tree_basics;

public class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value) {
        data = value;
        left = null;
        right = null;
    }

    public static TreeNode<Integer> populate() {
        TreeNode<Integer> root = new TreeNode<>(1);

        root.left = new TreeNode<>(2);

        root.left.left = new TreeNode<>(3);
        root.left.right = new TreeNode<>(4);

        root.left.right.left = new TreeNode<>(5);
        root.left.right.right = new TreeNode<>(6);

        root.right = new TreeNode<>(7);
        root.right.right = new TreeNode<>(8);
        root.right.right.left = new TreeNode<>(9);

        return root;
    }
}
