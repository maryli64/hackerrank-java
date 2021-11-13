package test;

import main.Tree;
import main.TreeNode;
import org.junit.Test;


public class TreeTest {

    @Test
    public void testOne(){
        TreeNode t5 = new TreeNode(5);
        TreeNode t11 = new TreeNode(11);
        TreeNode t2 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6, t5, t11);
        TreeNode t7 = new TreeNode(7, t2, t6);
        TreeNode t9 = new TreeNode(9);
        t9.left=t4;
        TreeNode t55 = new TreeNode(55);
        t55.right=t9;
        TreeNode t22 = new TreeNode(22, t7, t55);
        Tree tree = new Tree();
        tree.printLeftViewBinaryTree(t22, 1);
    }

}
