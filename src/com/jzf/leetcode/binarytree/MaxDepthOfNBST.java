package com.jzf.leetcode.binarytree;

/**
 * https://leetcode.cn/problems/maximum-depth-of-n-ary-tree/submissions/ <br>
 *
 * 559. N 叉树的最大深度
 *
 * easy
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/30 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class MaxDepthOfNBST {

    /**
     * 递归
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        int depth = 0;
        if (root == null) {
            return 0;
        }
        for (int i = 0; i < root.children.size(); i++) {
            depth = Math.max(depth, maxDepth(root.children.get(i)));
        }
        return depth + 1;
    }


}
