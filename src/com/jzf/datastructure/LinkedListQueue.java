package com.jzf.datastructure;

import com.jzf.datastructure.Interface.Queue;

/**
 * &lt;Description&gt; &lt;br&gt;
 *
 * @author JiaZhengfeng&lt;br&gt;
 * @version 1.0&lt;br&gt;
 * @taskId &lt;br&gt;
 * @CreateDate 2019/1/21 &lt;br&gt;
 * @see com.jzf.datastructure &lt;br&gt;
 * @since V9.0&lt;br&gt;
 */
public class LinkedListQueue<E> implements Queue<E> {

    private class Node {

        private E e;

        private Node next;

        public Node() {
            e = null;
            next = null;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;

    private Node tail;

    private int size = 0;

    public LinkedListQueue() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e) {
        if (isEmpty()) {
            head = new Node(e);
            tail = head;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("Dequeue failed.");
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (retNode == null)
            tail = null;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Getfront failed.");
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder linkedListQueue = new StringBuilder();
        linkedListQueue.append("LinkedListQue:head[");
        Node cur = head;
        while (cur != null) {
            linkedListQueue.append(cur + "->");
            cur = cur.next;
        }
        linkedListQueue.append("null]tail");
        return linkedListQueue.toString();
    }
}
