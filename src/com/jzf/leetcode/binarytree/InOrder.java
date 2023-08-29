package com.jzf.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历 <br>
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/28 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class InOrder {

    /**
     * 递归解法
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root) {

        List<Integer> r = new ArrayList<>();

        if (root == null) {
            return r;
        }

        r.addAll(inorderTraversal(root.left));
        r.add(root.val);
        r.addAll(inorderTraversal(root.right));
        return r;
    }


    /**
     * 迭代解法
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if (root == null) {
            return r;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            while (p != null) {
                stack.add(p);
                p = p.left;
            }
            p = stack.pop();
            r.add(p.val);
            p = p.right;
        }
        return r;
    }


}
