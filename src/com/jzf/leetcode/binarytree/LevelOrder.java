package com.jzf.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 普通层序遍历 <br>
 *
 * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/28 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class LevelOrder {

    /**
     * 队列实现
     * @param root
     * @return
     */
    public int[] levelOrder(TreeNode root) {

        List<Integer> r = new ArrayList<>();
        int[] result = new int[] {0};

        if (root == null) {
            return new int[] {};
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            r.add(root.val);

            if (null != root.left) {
                queue.add(root.left);
            }
            if (null != root.right) {
                queue.add(root.right);
            }

        }

        result = new int[r.size()];
        for (int i = 0; i < r.size(); i++) {
            result[i] = r.get(i);
        }

        return result;
    }

}
