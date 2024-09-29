package org.example;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/description/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] sol = new int[2];
        int i = 1;
        int k=0;
        HashMap<Integer,Integer> check = new HashMap();
        check.put(nums[0],0);
        while(i<nums.length){
            if(check.get(target-nums[i])!=null){
                k=check.get(target-nums[i]);
                break;
            }
            else{
                check.put(nums[i],i);
            }
            i++;
        }
        sol[0] = k;
        sol[1] = i;
        return sol;
    }
}