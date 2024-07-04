// stack follows first-in-last-out approach which means the elements which are added first will be removed at last and the elements which were
// added in the last will be removed first

// for example consider a bucket in which we are inserting books so the books which were added first will be stored at the very bottom
// and the books which were added at the last will be present at very top of the bucket when peek inside the bucket

// stack follows - LIFO (last in first out)

import java.util.*;

public class stack {
    public static void main(String args[]){
        Stack<Integer> stack_list = new Stack<>();

        // we use push() method to add elements inside the stack
        stack_list.push(1);
        stack_list.push(3);
        stack_list.push(5);
        stack_list.push(7);
        stack_list.push(9);
        stack_list.push(13);

        // peek() method is used to see which element is at the top of the stack list
        System.out.println(stack_list.peek());

        // firstElement() method is used to see which element is at the top of the stack list

        System.out.println(stack_list.firstElement());

        stack_list.pop(); // pop() method removes the top most element from the stack list, here it removes element 13

        System.out.println(stack_list.peek());  // now the peak element will become 9 since we have removed the 13 from the stack list

    }
    
}
