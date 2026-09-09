package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExamplePriorityQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2)
//                    return -1;
//                else if(o1 < o2)
//                    return 1;
//                else
//                    return 0;
//            }
//        });
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(50);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        queue.offer(5);
        queue.poll(); //10 20 30 50
        System.out.println(queue);
        queue.poll(); //20 30 50
        System.out.println(queue);
        queue.poll();//30 50
        System.out.println(queue);
        queue.poll();//50
        System.out.println(queue);
        queue.poll();//
        System.out.println(queue);
    }
}
