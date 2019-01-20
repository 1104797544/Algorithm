package com.jzf.datastructure.Interface;

/**
 * 栈接口
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    E pop();

    E peek();

    void push(E e);

}
