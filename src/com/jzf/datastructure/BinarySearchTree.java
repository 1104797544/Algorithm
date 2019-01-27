package com.jzf.datastructure;


import javax.annotation.Resource;
import java.util.Stack;

/**
 * 二叉搜索树的实现
 *
 * @author JiaZhengfeng
 * @version 1.0
 * @CreateDate 2019/1/27
 * @see com.jzf.datastructure
 */
public class BinarySearchTree<E extends Comparable<E>> {

    private class Node<E extends Comparable<E>> {

        private E e;

        private Node left;

        private Node right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }

    }

    private Node<E> root;

    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    private int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    //添加元素 递归版本1
/*    private void add(Node node, E e) {
        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo((E) node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        } else if (e.compareTo((E) node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        }

        if (e.compareTo((E) node.e) > 0) {
            add(node.right, e);
        } else {
            add(node.left, e);
        }
        return;
    }*/

    //添加元素 递归版本2
    private Node add(Node node, E e) {
        //递归终止条件 找到新插入结点应该插入的位置
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo((E) node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo((E) node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo((E) node.e) < 0) {
            return contains(node.left, e);
        } else if (e.compareTo((E) node.e) > 0) {
            return contains(node.right, e);
        }
        return true;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //前序遍历的非递归版本
    //使用栈来存储要遍历的结点 先入栈者后遍历
    public void preOrderNR() {
        preOrderNR(root);
    }

    private void preOrderNR(Node node) {
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            System.out.println(cur.e);

            if (cur.right != null) {
                stack.push(cur.right);
            }

            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (null == node) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (null == node) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateString(root, 0, res);
        return res.toString();
    }

    public void generateString(Node node, int depth, StringBuilder res) {
        if (null == node) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        generateString(node.left, depth + 1, res);
        generateString(node.right, depth + 1, res);
    }

    public String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("-");
        }
        return res.toString();
    }

}
