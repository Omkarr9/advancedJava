// queue follows FIFO approach ( first in first out)

// Queue can implemented by either ArrayList or LinkedList or PriorityQueue

import java.util.*;

public class queue {
    public static void main(String args[]){
        Queue<Integer> queue_list = new LinkedList<>();


        //offer() method is used to add elements into queue...if the task is successfull it returns true else it returns false
        // we can also use add() method to insert elements but it will return exception if the task fails
        // we are are not using add() method because if the task is successfull (ie elements are added) then it returns true else if 
        // the task fails then it returns an exception and not false....we use offer() method instead of add() to avoid returning exception in case of task failure
        queue_list.offer(1);
        queue_list.offer(2);
        queue_list.offer(3);
        queue_list.offer(4);
        queue_list.offer(5);

        queue_list.poll();  // removes the head element from the queue, in this case it removes 1 from the queue

        // queue_list.remove();
        // we can also use remove() method to remove head element from the queue but it returns an exception if the task fails or if the queue is empty

        System.out.println(queue_list); // this will print the queue elements in the form of lists

        // we can iterate through a queue using either for-each method or iterative method because queue does not support indexed iteration
        for(Integer element : queue_list){
            System.out.println(element);
        }

        System.out.println(queue_list.peek()); // peek() method returns the head element from the queue, in this case it is 2 since we have removed 1 from the queue list

        // in queue we cannot directly access element from certain index or add an element at certain index because it follows FIFO approach

        // however we can perform these operations by converting the queue_list into an normal List

        // Convert the queue to a list
        List<Integer> normal_list = new LinkedList<>(queue_list); // queue_list is the object of the queue, now this list will contain all elements in queue_list
        for(int i=0; i<normal_list.size(); i++){
            System.out.println(normal_list.get(i));
        }



    }
    
}
