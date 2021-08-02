package problem_solving.tree_basics;

import java.util.*;
import java.util.stream.Collectors;

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

    private static boolean validCount(int n) {
        double tmp = Math.log(n)/Math.log(2);

        return (int)tmp == tmp;
    }

    public static TreeNode<Integer> populate(List<Integer> nodes) throws Exception {
        if ((nodes.size() - 1) % 2 != 0 || nodes.size() == 0) {
            throw new Exception("Invalid size!");
        }

        TreeNode<Integer> root = new TreeNode<>(nodes.get(0));
        TreeNode<Integer> tracer = root;
        Deque<TreeNode<Integer>> q = new ArrayDeque<>();
        int counter = 1;

        while (counter < nodes.size()) {
            tracer.left = new TreeNode<Integer>(nodes.get(counter));
            counter++;
            tracer.right = new TreeNode<Integer>(nodes.get(counter));
            counter++;
            q.add(tracer.left);
            q.add(tracer.right);
            tracer = q.pop();
        }

        return root;
    }

    public static void main(String[] args) {

    }
}
