package com.jzf.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/search-insert-position/ <br>
 *
 * 35. 搜索插入位置
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/29 <br>
 * @see com.jzf.leetcode.binarysearch <br>
 * @since V9.0 <br>
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return low;
    }

}
