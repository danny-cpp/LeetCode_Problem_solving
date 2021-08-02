package problem_solving.tree_basics;

public class TreeDepth {
    private static int depth = 0;

    public static <T> int findDepth(TreeNode<T> node) {
        if (node == null) {
            return 0;
        }

        int left_depth = findDepth(node.left);
        int right_depth = findDepth(node.right);

        return Math.max(left_depth, right_depth) + 1;
    }
}
