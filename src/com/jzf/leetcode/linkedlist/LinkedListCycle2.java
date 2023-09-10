package com.jzf.leetcode.linkedlist;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/10 <br>
 * @see com.jzf.leetcode.linkedlist <br>
 * @since V9.0 <br>
 */
public class LinkedListCycle2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(0);
        ListNode head4 = new ListNode(-4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;

        LinkedListCycle2 linkedListCycle2 = new LinkedListCycle2();
        linkedListCycle2.detectCycle(head);
    }
    public ListNode detectCycle(ListNode head) {

        // 双指针fast与slow
        // fast每次走两步,slow每次走一步,第一次相遇,说明有环
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        // 无环
        if (fast == null || fast.next == null) {
            return null;
        }
        // 有环
        // slow或者fast重新从head开始,每次走相同得步数,再次相遇,即是入环得第一个节点
        // 原理：slow和fast第一次相遇时,slow走K步,则fast比slow多走K步,
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
