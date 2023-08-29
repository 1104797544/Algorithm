package com.jzf.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/sparse-array-search-lcci/ <br>
 *
 * 面试题 10.05. 稀疏数组搜索
 *
 * easy
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/29 <br>
 * @see com.jzf.leetcode.binarysearch <br>
 * @since V9.0 <br>
 */
public class SparseArraySearch {

    public int findString(String[] words, String s) {
        int low = 0;
        int high = words.length - 1;
        while (low <= high) {
            int mid = low + (high -low) / 2;
            if (words[mid].equals(s)) {
                return mid;
            }
            else if (words[mid].equals("")) {
                if (words[low].equals(s)) {
                    return low;
                }
                else {
                    low++;
                }
            }
            else if (words[mid].compareTo(s) < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;

    }
}
