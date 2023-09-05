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
public class AddTwoNumbers {

    private int carryNumer = 0;

    /**
     * 节点是低位到高位，计算也是低位到高位，所以不需要反转，直接相加。
     * 关键点1：进位的处理
     * 关键点2：遍历完链表后,如果进位大于0,还需要新增一个节点插入
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (l1 != null || l2 != null) {
            int newVal;
            int l1Val = 0;
            int l2Val = 0;

            if (l1 != null) {
                l1Val = l1.val;
            }
            if (l2 != null) {
                l2Val = l2.val;
            }

            int sum = l1Val + l2Val + carryNumer;
            if (sum >= 10) {
                // 关键点
                newVal = sum % 10;
                carryNumer = sum / 10;
            } else {
                newVal = sum;
                carryNumer = 0;
            }

            ListNode newNode = new ListNode(newVal);
            tail.next = newNode;
            tail = tail.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }

        if (carryNumer > 0) {
            ListNode newNode = new ListNode(carryNumer);
            tail.next = newNode;
        }

        return dummyHead.next;
    }

}
