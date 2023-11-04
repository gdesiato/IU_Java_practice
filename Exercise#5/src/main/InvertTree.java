package main;

public class InvertTree {


    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(8);
        treeNode.right.left = new TreeNode(2);
        treeNode.right.right = new TreeNode(7);

        treeNode = invertTree(treeNode);
        System.out.println(treeNode.val);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public static TreeNode invertTree(TreeNode root) {
            // Base case: if root is null, return null.
            if (root == null) {
                return null;
            }

            // Recursively invert the left subtree
            TreeNode left = invertTree(root.left);

            // Recursively invert the right subtree
            TreeNode right = invertTree(root.right);

            // Swap left and right subtrees
            root.left = right;
            root.right = left;

            return root;
        }
    }

