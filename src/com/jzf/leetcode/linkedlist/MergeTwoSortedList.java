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
public class MergeTwoSortedList {

    /**
     * 新增虚拟头节点作为合并后新链表的头节点,
     * 依次取两个链表的节点采用尾插法加入到新链表中
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }
        // 有一个为空,直接返回另一个
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode dummyHead = new ListNode();
        ListNode merge = dummyHead;

        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null || p2 != null) {

            if (p1 == null || (p2 != null && p2.val < p1.val)) {
                merge.next = p2;
                p2 = p2.next;
            } else {
                merge.next = p1;
                p1 = p1.next;
            }
            merge = merge.next;
        }

        return dummyHead.next;

    }

}
