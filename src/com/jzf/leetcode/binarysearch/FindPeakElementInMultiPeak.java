package com.jzf.leetcode.binarysearch;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/26 <br>
 * @see com.jzf.leetcode.binarysearch <br>
 * @since V9.0 <br>
 */
public class FindPeakElementInMultiPeak {

    public static void main(String[] args) {
        findPeakElement(new int[] {1,2,3,1});
    }

    public static int findPeakElement(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] < nums[1] ? nums[1] : nums[0];
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid] > nums[mid] + 1) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;

    }

}
