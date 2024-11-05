package com.example.leetcode.explore.recursion;

public class SearchInABinarySearchTree {

    public static void main(String[] args) {
        var application = new SearchInABinarySearchTree();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        int val = 2;
        TreeNode result = application.searchBST(root, val);
        System.out.println("Result: " + result);
    }

    private TreeNode searchBST(TreeNode root, int val) {
        if (null == root || val == root.val) return root;
        
        if (val > root.val) {
            return this.searchBST(root.right, val);
        } else {
            return this.searchBST(root.left, val);
        }
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