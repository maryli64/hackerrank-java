package test;

import main.LeafSimilarTrees;
import main.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LeafSimilarTreesTest {

    /**
     * Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
     * Output: true
     */
    @Test
    public void testOne(){
        TreeNode t1 = new TreeNode(1, new TreeNode(9), new TreeNode(8));
        TreeNode t2 = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        TreeNode t5 = new TreeNode(5, new TreeNode(6), t2);
        TreeNode t3 = new TreeNode(3, t5, t1);

        TreeNode t5_1 = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        TreeNode t2_1 = new TreeNode(2,new TreeNode(9), new TreeNode(8));
        TreeNode t1_1 = new TreeNode(1,new TreeNode(4), t2_1);
        TreeNode t3_1 = new TreeNode(3,t5_1, t1_1);

        LeafSimilarTrees leafSimilarTrees = new LeafSimilarTrees();
        Assert.assertTrue(leafSimilarTrees.leafSimilar(t3,t3_1));
    }

}
