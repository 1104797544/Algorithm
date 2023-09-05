package com.jzf.leetcode.linkedlist;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/6 <br>
 * @see com.jzf.leetcode.linkedlist <br>
 * @since V9.0 <br>
 */
public class ReverseList {

    /**
     * 迭代解法
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        // 反转后的新链表的虚拟头节点
        ListNode dummyHead = new ListNode();
        // 遍历原链表的指针
        ListNode tail = head;

        while (tail != null) {
            // 临时保存节点
            ListNode temp = tail;
            // 指针后移
            tail = tail.next;
            // 采用尾插法加入到新链表中
            temp.next = dummyHead.next;
            dummyHead.next = temp;
        }

        return dummyHead.next;
    }


    /**
     * 递归解法
     * 核心是head.next.next = head;
     * 最终返回的是反转后的头节点,也就是反转前的尾节点
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // 保存反转后的头节点,一直返回
        ListNode newNode = reverseList2(head.next);
        head.next.next = head;
        // 将原next置空,防止形成环
        head.next = null;
        return newNode;
    }
}