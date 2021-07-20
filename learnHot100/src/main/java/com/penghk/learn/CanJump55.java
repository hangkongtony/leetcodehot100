package com.penghk.learn;

/**
 * 贪心
 */
public class CanJump55 {

    public static boolean canJump(int[] nums) {

        int maxJump = 0;
        int maxJumpInStep;
        for (int i = 0; i < nums.length; i++) {
            if (maxJump < i) {
                break;
            }
            maxJumpInStep = i + nums[i];
            maxJump = Math.max(maxJumpInStep, maxJump);
        }

        return maxJump > nums.length - 1;

    }


    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }


}
