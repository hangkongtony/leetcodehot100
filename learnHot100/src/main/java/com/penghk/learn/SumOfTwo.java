package com.penghk.learn;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * <a>https://leetcode-cn.com/problems/two-sum/</a>
 * @Author:hangkong.peng
 * @Date: 2021/6/18 11:11
 */
public class SumOfTwo {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 3, 12};
        int target = 10;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);

    }



}
