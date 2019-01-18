package com.jzf.sort;

import java.util.ArrayList;

/**
 *
 * @author JiaZhengfeng
 * @version 1.0
 * @see com.jzf.sort
 */
public class Array<E> {

    private E[] data;

    private int size;

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return true;
        }
        return false;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public void  addFirst(E e){
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add failed, index is illegal.");

        if (size == data.length)
            resize(2 * data.length);

        for(int i = size - 1; i >= index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    public E getIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("getIndex failed, index is illegal.");
        return data[index];
    }

    public void setIndex(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("setIndex failed, index is illegal.");
        data[index] = e;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("remove failed, index is illegal.");
        E ret = data[index];
        for (int i = index + 1; i < size; i++)
            data[i-1] = data[i];
        size --;
        data[size] = null;
        if (size == data.length/2)
            resize(data.length/2);
        return ret;
    }

    public boolean removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public E removeFirst(int index) {
        return remove(0);
    }

    public E removeLast(int index) {
        return remove(size - 1);
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array : size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for(int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(",");
        }
        res.append("]");
        return res.toString();
    }

}
