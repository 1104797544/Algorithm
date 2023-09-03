package com.jzf.leetcode.binarytree;

/**
 * https://leetcode.cn/problems/binode-lcci/description/ <br>
 *
 * 面试题 17.12. BiNode
 *
 * medium
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/3 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class FlattenBinarySearchTreeLinkedList {

    private TreeNode pre = null;

    public TreeNode convertBiNode(TreeNode noot) {
        if (noot == null) {
            return null;
        }
        TreeNode right = convertBiNode(noot.right);

        TreeNode left = convertBiNode(noot.left);


        return noot;

    }

}
