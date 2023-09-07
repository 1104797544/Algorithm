package com.jzf.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/7 <br>
 * @see com.jzf.leetcode.linkedlist <br>
 * @since V9.0 <br>
 */
public class CopyListWithRandomPointer {

    public static void main(String[] args) {
/*        Node a = new Node(1);
        Node b = new Node(2);
        a.random = a;
        a.next = b;
        b.random = a;*/

        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        b.random = a;
        c.next = d;
        c.random = e;
        d.next = e;
        d.random = c;
        e.random = a;


        CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();
        copyListWithRandomPointer.copyRandomList(a);
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // 1.遍历链表
        // 1.1.复制节点,加到新链表中
        // 1.2 记录原链表节点和新链表节点的关系
        // 2.遍历新链表
        // 2.1 处理random
        Node dummyHead = new Node(0);
        Node tail = dummyHead;

        Map<Node, Node> map = new HashMap<>();

        while (head != null) {
            Node newNode = new Node(head.val);
            newNode.random = head.random;

            tail.next = newNode;
            tail = tail.next;

            map.put(head, newNode);

            head = head.next;
        }

        tail = dummyHead.next;
        while (tail != null) {
            if (tail.random != null) {
                tail.random = map.get(tail.random);
            }
            tail = tail.next;
        }
        return dummyHead.next;
    }
}
