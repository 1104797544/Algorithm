package com.jzf.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 03. 数组中重复的数字 <br>
 *
 * https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/description/
 *  
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/24 <br>
 * @since V9.0 <br>
 * @see com.jzf.leetcode.hash <br>
 */
class FindRepeatNumber {


    public int findRepeatNumber(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            else {
                map.put(nums[i], true);
            }
        }
        return 0;

    }

    public int findRepeatNumber2(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if (i == nums[i]) {
                i++;
                continue;
            }
            else if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            else {
                int p = nums[i];
                nums[i] = nums[p];
                nums[p] = p;
            }
        }
        return -1;

    }
}
