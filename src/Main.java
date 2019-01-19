import com.jzf.datastructure.LoopQueue;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
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
    }
}
