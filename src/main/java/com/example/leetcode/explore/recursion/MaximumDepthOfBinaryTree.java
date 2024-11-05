package com.example.leetcode.explore.recursion;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        var application = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int result = application.maxDepth(root);
        System.out.println("Result: " + result);
    }

    public int maxDepth(TreeNode root) {
        if (null == root) return 0;
        return Math.max(this.maxDepth(root.left), this.maxDepth(root.right)) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}