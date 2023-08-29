package com.jzf.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/find-smallest-letter-greater-than-target/ <br>
 *
 * 744. 寻找比目标字母大的最小字母
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/29 <br>
 * @see com.jzf.leetcode.binarysearch <br>
 * @since V9.0 <br>
 */
public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                if (mid == 0 || letters[mid -1] <= target) {
                    return letters[mid];
                }
                else {
                    high = mid - 1;
                }
            }
            else {
                low = mid + 1;
            }
        }
        return letters[0];

    }

}
