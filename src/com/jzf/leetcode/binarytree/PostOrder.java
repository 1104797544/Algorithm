package com.jzf.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

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
public class PostOrder {

    /**
     * 递归解法
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if (root == null) {
            return r;
        }
        r.addAll(postorderTraversal(root.left));
        r.addAll(postorderTraversal(root.right));
        r.add(root.val);
        return r;
    }

    /**
     * 迭代解法
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        return r;

    }
}
