package main;

public class Tree {
    private int maxLevel = 0;
    public void printLeftViewBinaryTree(TreeNode treeNode, int level) {
        if (treeNode == null) {
            return;
        }

        if (maxLevel < level) {
            maxLevel = level;
            System.out.println(treeNode.val);
        }

        printLeftViewBinaryTree(treeNode.left, level + 1);
        printLeftViewBinaryTree(treeNode.right, level + 1);
    }

}
