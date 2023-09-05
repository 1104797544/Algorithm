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
public class Palindrome {

    public boolean isPalindrome(ListNode head) {
        if (null == head) {
            return false;
        }

        // 找到中间节点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midHead = slow;

        // 反转后半部分链表,返回的是原链表的尾节点
        midHead = reverseList(midHead);

        // 反转之后,前半部和后半部链表的尾节点都是中间节点
        // 从两边的头节点,分别向中间遍历
        boolean flag = true;
        while (midHead != null) {
            if (!(midHead.val == head.val)) {
                flag = false;
                break;
            }
            midHead = midHead.next;
            head = head.next;
        }
        return flag;
    }

    private ListNode reverseList(ListNode head) {
/*        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;*/
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



}
