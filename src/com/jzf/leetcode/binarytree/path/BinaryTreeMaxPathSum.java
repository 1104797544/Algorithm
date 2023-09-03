package com.jzf.leetcode.binarytree.path;

import com.jzf.leetcode.binarytree.TreeNode;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/3 <br>
 * @see com.jzf.leetcode.binarytree.path <br>
 * @since V9.0 <br>
 */
public class BinaryTreeMaxPathSum {

    public static void main(String[] args) {
        BinaryTreeMaxPathSum treeMaxPathSum = new BinaryTreeMaxPathSum();


/*        TreeNode left = new TreeNode(2, null, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, left, right);*/


        TreeNode root = new TreeNode(-3, null, null);

        treeMaxPathSum.maxPathSum(root);

    }

    private Integer max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        maxGain(root);

        return max.intValue();
    }

    public int maxGain(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int leftMax = Math.max(maxGain(root.left), 0);
        int rightMax = Math.max(maxGain(root.right), 0);

        int childMax = leftMax + rightMax;

        int rootMax = childMax + root.val;
        if (rootMax > max) {
            max = rootMax;
        }

        return rootMax;
    }

}
