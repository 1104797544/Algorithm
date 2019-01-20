import com.jzf.datastructure.LindedList;
import com.jzf.datastructure.LinkedListQueue;
import com.jzf.datastructure.LoopQueue;

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
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 5; i ++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue);
        }
        linkedListQueue.dequeue();
        System.out.println(linkedListQueue);


    }
}
