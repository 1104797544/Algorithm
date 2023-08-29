package com.jzf.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 513. 找树左下角的值 <br>
 * <p>
 * https://leetcode.cn/problems/find-bottom-left-tree-value/
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/28 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class LevelOrderGroup3 {

    /**
     * 解法1:正常的分组层序遍历,最后一组第一个元素
     *
     * @param root
     * @return
     */
    public int findBottomLeftValue1(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> levelResult = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                levelResult.add(node.val);
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
            }
            result.add(levelResult);
        }

        List<Integer> list = result.get(result.size() - 1);
        int r = list.get(0);
        return r;

    }

    /**
     * 解法2:每层从右到左遍历,最后一个元素即是答案
     *
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        int r = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (null != node.right) {
                    queue.add(node.right);
                }
                if (null != node.left) {
                    queue.add(node.left);
                }
                r = node.val;
            }
        }

        return r;

    }


}
