package test;

import main.FindLeaves;
import main.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLeavesTest {

    @Test
    public void testOne(){
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t1 = new TreeNode(1, t2, t3);

        FindLeaves findLeaves = new FindLeaves();
        List<List<Integer>> result= findLeaves.findLeaves(t1);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> a1= new ArrayList<>(Arrays.asList(4,5,3));
        List<Integer> a2= new ArrayList<>(Arrays.asList(2));
        List<Integer> a3= new ArrayList<>(Arrays.asList(1));
        expected.add(a1);
        expected.add(a2);
        expected.add(a3);
        Assert.assertEquals(expected, result);


    }

}
