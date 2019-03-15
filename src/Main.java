import com.jzf.datastructure.*;
import com.jzf.leetcode.LongestCommonPrefix;
import com.jzf.leetcode.ReverseInteger;
import com.jzf.other.Merger;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

/*        Integer[] nums = {-2,0,3,-5,2,1};
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, new Merger<Integer>() {
            @Override
            public Integer merger(Integer e1, Integer e2) {
                return e1 + e2;
            }
        });
        int res = segmentTree.query(0,1);
        int res2 = segmentTree.query(1,4);
        int res3 = segmentTree.query(0, 5);
        System.out.println(res +" " + res2 + " " + res3);
*/
/*        ReverseInteger reverseInteger = new ReverseInteger();
        int a = reverseInteger.reverse(1534236469);
        System.out.println(a);*/
        String[] strs = {"c", "c"};
        String rs = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println(rs);


/*        MaxHeap<Integer> heap = new MaxHeap<>();
        int n = 100;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            heap.add(random.nextInt(100));
        }
        for (int i = 0; i < heap.getSize(); i++) {
            System.out.println(heap.extractMax());
        }*/
/*        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++)
            queue.enqueue(i);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(10);
        System.out.println(queue);
        queue.enqueue(11);
        System.out.println(queue);
        queue.enqueue(12);
        System.out.println(queue);
        System.out.println(queue.getTail());*/

/*        LindedList<Integer> lindedList = new LindedList<>();
*//*        for (int i =0;i < 5;i ++) {
            lindedList.addFirst(i);
            System.out.println(lindedList);
        }*//*
        //lindedList.addFirst(666);
        System.out.println(lindedList);
        lindedList.remove(0);
        System.out.println(lindedList);*/
/*        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 5; i ++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue);
        }
        linkedListQueue.dequeue();
        System.out.println(linkedListQueue);

        String a = "aaa";
        a.substring(0, a.length() - 1);*/

/*        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i ++)
            linkedListQueue.enqueue(i);
        System.out.println(linkedListQueue);
        linkedListQueue.dequeue();
        System.out.println(linkedListQueue);
        linkedListQueue.dequeue();
        System.out.println(linkedListQueue);*/

/*        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(10);
        bst.add(2);
        bst.add(12);
        bst.add(20);
        bst.add(3);
        bst.add(1);*/

        //bst.preOrderNR();
        //bst.levelOrder();
        //System.out.println(bst);
        //bst.removeMin();
        //System.out.println(bst);
        //bst.removeMax();
        //System.out.println(bst);
        //bst.remove(10);
        //System.out.println(bst);
        //Set
        //PriorityQueue

    }
}
