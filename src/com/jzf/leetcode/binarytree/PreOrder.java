package com.jzf.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/28 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class PreOrder {

    /**
     * 递归解法
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {

        List<Integer> r = new ArrayList<>();

        if (root == null) {
            return r;
        }

        r.add(root.val);
        if (root.left != null) {
            r.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            r.addAll(preorderTraversal(root.right));
        }
        return r;

    }


    /**
     * 迭代解法
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // 返回值
        List<Integer> r = new ArrayList<>();
        // 空值判断
        if (root == null) {
            return r;
        }

        // 初始化栈
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                r.add(node.val);
                stack.add(node);
                node = node.left;
            }
            // 左子树为空时,回到根节点,继续从右子树开始
            node = stack.pop();
            node = node.right;
        }

        return r;

    }


}
