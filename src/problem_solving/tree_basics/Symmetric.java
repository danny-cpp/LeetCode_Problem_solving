package problem_solving.tree_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Symmetric {
    private boolean helper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.data == node2.data) {
            return (helper(node1.left, node2.right) && helper(node1.right, node2.left));
        }

        return false;
    }

    public <T> boolean symmetricCheck(TreeNode<T> node) {
        if (node.left == null && node.right == null) {
            return true;
        }

        if (node.left == null || node.right == null) {
            return false;
        }

        return helper(node.left, node.right);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 4, 3};
        List<Integer> l = Arrays.stream(arr).collect(Collectors.toList());

        TreeNode<Integer> root = null;
        try {
            root = TreeNode.populate(l);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Symmetric s = new Symmetric();
        System.out.println(s.symmetricCheck(root));;
    }
}
