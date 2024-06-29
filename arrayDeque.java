// The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface. 
// It is also known as Array Double Ended Queue or Array Deck. 
// This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.

// The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue, 
// making it a good choice for scenarios where you need to perform many add and remove operations.

// we can consider this an upgraded version of Queue because we can add or remove elements from both start and end unlike queue where the first elements are always removed first (FIFO)

import java.util.*;

public class arrayDeque {
    public static void main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(1);
        adq.offer(2);
        adq.offer(3);
        adq.offer(4);
        adq.offer(5);

        System.out.println(adq);

        adq.addFirst(101); // this element will added at the starting of the adq

        adq.addLast(102);  // this element will be added at the last of the adq

        System.out.println(adq);

        adq.poll(); // removes the head element from adq ,  in this case it is 101

        adq.pollLast(); // removes the last or ending element from the adq,  in this case it is 102

        adq.pollFirst(); // this is same as poll();

        /* stack can also be implemented using ArrayDeque, after which we can add or remove elements from both sides */

        for(Integer element : adq){
            System.out.println(element);
        }
    }
}
