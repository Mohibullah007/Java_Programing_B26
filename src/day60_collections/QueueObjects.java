package day60_collections;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        //queue.get(); get method is from list
        System.out.println(queue);

        System.out.println("----------------------------");
        queue.offer(70); // same as add method
        System.out.println(queue);

//        queue.offer(null);    TODO: CAUSES EXCEPTION BECAUSE queue does not accept NULL
//        System.out.println(queue);

       // System.out.println(new PriorityQueue<>().remove()); TODO: CAUSES EXCEPTION BECAUSE queue does not accept NULL
    }
}
