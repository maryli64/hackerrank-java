package main;

//import javax.swing.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class LeafSimilarTrees {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<TreeNode> list1 = new ArrayList<TreeNode>();
        List<TreeNode> list2 = new ArrayList<TreeNode>();

        getLeafs(root1, list1);
        getLeafs(root2, list2);

        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).val!=list2.get(i).val){
                return false;
            }
        }

        return true;
    }

    private void getLeafs(TreeNode root, List<TreeNode> leafs) {
        if (root.left == null && root.right == null) {
            leafs.add(root);
        } else {
            if(root.left!=null) {
                getLeafs(root.left, leafs);
            }
            if(root.right!=null) {
                getLeafs(root.right, leafs);
            }
        }
    }

}
