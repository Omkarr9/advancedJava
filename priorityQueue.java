// 

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // this acts as a MinHeap (smallers value elements are given highest priority)

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // now this acts a MaxHeap (larger value elements are given highest priority)

        // all methods used for queue can be used for priorityQueue also

        pq.offer(10);
        pq.offer(17);
        pq.offer(2);  // this element will be given highest priority because it is smallest value
        pq.offer(20);
        pq.offer(7);

        System.out.println(pq); // this will print all the elements inside the pq in the form of list

        pq.poll();  // poll() method will remove the head element which in this case, it is 2

        System.out.println(pq);  // 2 will be removed and 7 will appear at the top because it was the second biggest element

        System.out.println(pq.peek());  // gives the head element in the pq

        List<Integer> normal_list = new LinkedList<>(pq);
        for(Integer element : normal_list){
            System.out.println(element);
        }
    }
    
}
