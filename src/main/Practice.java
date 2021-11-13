package main;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;

public class Practice {
    public static void main(String[] args){
        Map<Integer, Integer> hashmap = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        Queue<String> pq = new PriorityQueue<>(Comparator.comparing(String::length));
        List<String> stringList= new ArrayList<>();
        stringList.sort(Comparator.comparing(String::length).reversed());
        stringList.sort(Comparator.comparing(Function.identity(), String::compareToIgnoreCase).reversed());
        stringList.sort(Comparator.comparing(Function.identity(), String::compareToIgnoreCase).reversed());
        Stack<String> s = new Stack<>();
        String test= "AA";
        String[] res=test.split("AA");
        int length = res.length;
        System.out.println("");
        Character.toLowerCase('H');
        char c='c';
        char b='b';
        if(c<b){

        }
        //hashmap.remove()
    }
    private void inOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            inOrderTraversal(treeNode.left);
            inOrderTraversal(treeNode);
            inOrderTraversal(treeNode.right);
        }
    }

    private void preOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            inOrderTraversal(treeNode);
            inOrderTraversal(treeNode.left);
            inOrderTraversal(treeNode.right);
        }
    }

    private void postOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            inOrderTraversal(treeNode.left);
            inOrderTraversal(treeNode.right);
            inOrderTraversal(treeNode);
        }
    }
}
