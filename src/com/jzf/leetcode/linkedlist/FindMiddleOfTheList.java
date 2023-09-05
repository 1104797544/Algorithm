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
public class FindMiddleOfTheList {

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

}
