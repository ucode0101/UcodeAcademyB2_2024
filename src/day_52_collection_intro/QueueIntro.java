package day_52_collection_intro;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {

        // Regular way
        PriorityQueue<Integer> num1 = new PriorityQueue<>();

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(15);
        //System.out.println(queue.poll());

        queue.addAll(Arrays.asList(33,34,5,6,7,8));

        System.out.println(queue.peek());

        System.out.println(queue);


    }
}
