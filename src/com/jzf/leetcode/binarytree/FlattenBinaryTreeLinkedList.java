package com.jzf.leetcode.binarytree;

/**
 * https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/description/ <br>
 *
 *  114. 二叉树展开为链表
 *
 *  medium
 *
 * 遍历左子树cur,找到最右的节点,作为右子树的前驱节点pre;
 * 将pre指向右子树pre.right = root.right,root.right=cur,root.left=null
 * 终止条件cur=null
 *
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/3 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class FlattenBinaryTreeLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        while (cur != null) {
            TreeNode pre = cur.left;
            if (pre != null) {
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }


}
