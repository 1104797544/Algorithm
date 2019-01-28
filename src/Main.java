import com.jzf.datastructure.BinarySearchTree;
import com.jzf.datastructure.LindedList;
import com.jzf.datastructure.LinkedListQueue;
import com.jzf.datastructure.LoopQueue;

import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
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

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(10);
        bst.add(2);
        bst.add(12);
        bst.add(20);
        bst.add(3);
        bst.add(1);

        //bst.preOrderNR();
        //bst.levelOrder();
        //System.out.println(bst);
        //bst.removeMin();
        //System.out.println(bst);
        //bst.removeMax();
        //System.out.println(bst);
        bst.remove(10);
        System.out.println(bst);
        //Set

    }
}
