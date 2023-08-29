package com.jzf.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/search-in-rotated-sorted-array/ <br>
 * <p>
 * 33. 搜索旋转排序数组
 * <p>
 * medium
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/29 <br>
 * @see com.jzf.leetcode.binarysearch <br>
 * @since V9.0 <br>
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {

                    low = mid + 1;
                }

            } else if (nums[mid] <= nums[high]) {

                if (nums[mid] < target && target <= nums[high]) {

                    low = mid + 1;

                } else {
                    high = mid - 1;
                }

            }

        }
        return -1;

    }

}
