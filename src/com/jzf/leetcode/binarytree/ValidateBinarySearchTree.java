package com.jzf.leetcode.binarytree;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/8/31 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class ValidateBinarySearchTree {

    private Long lower = Long.MIN_VALUE;
    private Long upper = Long.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isValidBST(root, lower, upper);
    }

    public boolean isValidBST(TreeNode root, Long lower, Long upper) {
        if(root == null) {
            return true;
        }
        if (root.val <= lower || root.val >= upper) {
            return false;
        }
        return isValidBST(root.left, lower, Long.valueOf(root.val))
                && isValidBST(root.right, Long.valueOf(root.val), upper);

    }

}
