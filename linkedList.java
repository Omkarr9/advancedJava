// LinkedList is linear data structure where the elements are not stored in contiguous locations and every element is a separate 
// object with a data part and address part. 
// The elements are linked using pointers and addresses. Each element is known as a node. 

// each element has reference (pointer) to both previous and next element in the LinkedList

//LinkedList follows FIFO approach (first in first out)

// how linkedList is different than arrayList?
/* in arrayList if we want to insert or delete an element in between the list then each element has to be moved in both left and right direction
but in LinkedList when we want to insert or delete an element from the LinkedList then we just need the reference address of 
left and right element and then we can just add the new element and this new element has reference to both its previous and next element */

/* Since a LinkedList acts as a dynamic array and we do not have to specify the size while creating it, the size of the list automatically 
increases when we dynamically add and remove items. And also, the elements are not stored in a continuous fashion. */

// in arrayList we can set initial size of the arrayList but in LinkedList we cannot set initial size of LinkedList

// we can use almost all the methods inside the LinkedList that are used for ArrayList but it is not the same for Vice-Versa

/* time complexity of ArrayList is O(n) while time complexity of LinkedList is O(1) because we 
   have references to previous and next element so we directly add or remove elements without having to move all the elements to the left or right */

import java.util.*;

public class linkedList {
    public static void main(String args[]) {
        LinkedList<Integer> arr1 = new LinkedList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        arr1.add(0, 99);
        arr1.add(1, 100);
        /*
         * we can add values at particular index position and if any value is already
         * present at that position then it will be placed next to that index position
         */

        arr1.add(0, 101); // we add elements to the LinkedList at particular position as many times as we
                          // want

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(1000);
        arr2.add(10001);
        arr2.add(1002);
        arr2.add(1003);
        arr2.add(1004);

        arr1.addAll(arr1.size(), arr2); // addAll is used to add a LinkedList to an existing LinkedList and we also set
                                        // the index from which we want to add elements
        // all the elements in arr2 are now also been added to arr1 starting from the
        // arr1.size() index position, which was the last index position of original
        // arr1

        // arr1.clear(); // removes all the elements from the LinkedList.

        System.out.println(arr1.indexOf(100)); // return the index of given element in the LinkedList and if the element
                                               // is not present then it return -1
        // indexOf always return the first index of the given element if multiple same
        // elements are present

        System.out.println(arr1.lastIndexOf(1001)); // return the last index of given element in the LinkedList

        arr1.remove(0); // removes an element from the specified index

        arr1.set(1, 99); // set() replaces the element at the given index unlike add() which only adds
                         // element and moves the rest of the elements to the left of the LinkedList

        for (int i = 0; i < arr1.size(); i++) { // size() is used to get the total length of the LLinkedList where as we
                                                // use length() to get total size of the normal array
            System.out.println(arr1.get(i)); // .get(index_value) is used to get the value at that particular index
        }

        System.out.println(arr1.contains(69)); // contains checks if the given value is present in the LinkedList or not
                                               // and return boolean value true or false

        // we can also use Iterator to access each element inside the arrayList
        System.out.println("Using iterator");
        Iterator<Integer> it = arr1.iterator();
        while (it.hasNext()) { // prints elements until the LinkedList is finished
            System.out.println(it.next());
        }

        // we can also use for each to access arrayList
        System.out.println("Using for-each");
        for (Integer elements : arr1) {
            System.out.println("element is " + elements);
        }
    }
}
