package main;

import java.util.ArrayList;
import java.util.List;

public class FindLeaves {

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        List<Integer> leavesList= new ArrayList<>();
        while(root.left!=null || root.right!=null){
            removeLeaves(root, null, leavesList);
            result.add(leavesList);
            leavesList=new ArrayList<>();
        }
        leavesList.add(root.val);
        result.add(leavesList);
        return result;
    }

    private void removeLeaves(TreeNode node, TreeNode parent, List<Integer> leavesList){
        if(node==null){
            return;
        }
        if(isLeaf(node)){
         leavesList.add(node.val);
         if(parent!=null){
             if(parent.left!=null && parent.left.val == node.val){
                 parent.left=null;
             }else if(parent.right!=null && parent.right.val == node.val){
                 parent.right=null;
             }
         }
        }
        removeLeaves(node.left, node, leavesList);
        removeLeaves(node.right, node, leavesList);
    }

    boolean isLeaf(TreeNode node){
        return node.left==null && node.right==null;
    }
}
