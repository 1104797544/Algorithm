package com.jzf.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III <br>
 *
 * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/28 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class LevelOrderGroup2 {


    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        boolean isLeft = true;
        while (!queue.isEmpty()) {
            Deque<Integer> levelResult = new LinkedList<>();

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();

                if (isLeft) {
                    levelResult.addLast(node.val);
                }
                else {
                    levelResult.addFirst(node.val);
                }
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
            }
            isLeft = !isLeft;

            result.add(new ArrayList(levelResult));
        }
        return result;
    }

}
