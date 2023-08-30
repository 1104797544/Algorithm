package com.jzf.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/solutions/ <br>
 *
 * 104. 二叉树的最大深度
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
public class MaxDepthOfBST {

    /**
     * 递归解法
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        int depth = 0;
        if (root == null) {
            return depth;
        }

        depth = Math.max(maxDepth(root.left), maxDepth(root.right));

        return depth + 1;
    }

    /**
     * BFS解法
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {

        int depth = 0;

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int l = queue.size();
            for (int i = 0; i < l; i++) {
                TreeNode node = queue.poll();
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
                depth = depth + 1;
            }

        }

        return depth;

    }

}
