package main;

import java.util.*;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        int floorVal=Math.floorDiv(nums.length,2);
        //Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Queue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        int count=0;

        while(!pq.isEmpty() && count<floorVal) {
            pq.poll();
            count++;
        }

        return pq.peek();
    }

    public int v2(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        int floorVal=Math.floorDiv(nums.length,2);

        Map<Integer, Integer> hashmap= new HashMap<>();
        for(int num : nums){
            if(hashmap.get(num)!=null){
                hashmap.put(num,hashmap.get(num)+1);
            }else{
                hashmap.put(num, 1);
            }

            if(hashmap.get(num)>floorVal){
                return num;
            }
        }
        return -1;
    }
}
