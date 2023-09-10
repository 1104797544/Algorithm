package com.jzf.leetcode.dp;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/8 <br>
 * @see com.jzf.leetcode.dp <br>
 * @since V9.0 <br>
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        runningSumOf1dArray.runningSum(new int [] {3,1,2,10,1});
    }
    public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0;  i < nums.length; i++) {
            if (i == 0) {
                result[i] = nums[i];
            }
            else {
                result[i] = result[i - 1] + nums[i];
            }
        }
        return result;
    }
}
