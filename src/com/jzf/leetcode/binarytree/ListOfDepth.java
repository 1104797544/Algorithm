package com.jzf.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.cn/problems/list-of-depth-lcci/description/ <br>
 *
 * 面试题 04.03. 特定深度节点链表
 *
 * medium
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/2 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class ListOfDepth {

    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(tree);

        while (!queue.isEmpty()) {
            // 遍历每层节点时,用一个虚拟头节点,使用尾插法向链表插入节点
            ListNode dummyHead = new ListNode();
            ListNode tail = dummyHead;
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                TreeNode top = queue.poll();

                // 尾插法
                ListNode newNode = new ListNode(top.val);
                tail.next = newNode;
                tail = newNode;

                if (top.left != null) {
                    queue.add(top.left);
                }
                if (top.right != null) {
                    queue.add(top.right);
                }
            }
            // 每层节点组成的链表,返回头节点即可
            list.add(dummyHead.next);
        }

        ListNode[] arr = new ListNode[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
