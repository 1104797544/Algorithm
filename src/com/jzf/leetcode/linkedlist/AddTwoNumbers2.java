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
public class AddTwoNumbers2 {

    /**
     * 先反转两个链表,然后就是正常的两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode dummyHead = new ListNode();

        int sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;

            int temp = l1Val + l2Val + carry;
            sum = temp % 10;
            carry = temp / 10;

            ListNode newNode = new ListNode(sum);
            newNode.next = dummyHead.next;
            dummyHead.next = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = dummyHead.next;
            dummyHead.next = newNode;
        }

        return dummyHead.next;
    }

    public ListNode reverseList(ListNode l) {
        if (l == null || l.next == null) {
            return l;
        }
        ListNode newNode = reverseList(l.next);
        l.next.next = l;
        l.next = null;
        return newNode;
    }
}
