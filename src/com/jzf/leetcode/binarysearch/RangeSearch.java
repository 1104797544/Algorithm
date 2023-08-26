package com.jzf.leetcode.binarysearch;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/25 <br>
 * @see com.jzf.leetcode.binarysearch <br>
 * @since V9.0 <br>
 */
public class RangeSearch {

    public static void main(String[] args) {
        searchRange(new int[] {1, 2, 3}, 1);
    }

    public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[] {0, 0};
            }
            else {
                return new int[] {-1, -1};
            }
        }


        int first = -1;
        int last = -1;

        // 先找第一个等于的
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            // 中值小,往右移
            if (nums[mid] < target) {
                low = mid + 1;
            }
            // 中值等于,向前探测
            else if (nums[mid] == target) {
                // 向前探测,没有相等的了,直接返回
                if (mid == 0 || nums[mid - 1] < target) {
                    first = mid;
                    break;
                }
                // 向前探测,还有更小的,high要左移
                else if (nums[mid - 1] == target){
                    high = mid - 1;
                }
            }
            else {
                high = mid - 1;
            }
        }


        // 找最后一个等于的
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // 中值小,往右移
            if (nums[mid] < target) {
                low = mid + 1;
            }
            // 中值等于,向后探测
            else if (nums[mid] == target) {
                // 向后探测,没有相等的了,直接返回
                if (mid + 1 == nums.length || nums[mid + 1] > target) {
                    last = mid;
                    break;
                }
                // 向后探测,还有相等的,low要右移
                else if (nums[mid + 1] == target){
                    low = mid + 1;
                }
            }
            else {
                high = mid - 1;
            }
        }

        return new int[] {first, last};


    }

}
