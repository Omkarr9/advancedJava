// A few important features of HashSet are mentioned below:

// Implements Set Interface.
// The underlying data structure for HashSet is Hashtable.
// As it implements the Set Interface, duplicate values are not allowed.
// Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
// NULL elements are allowed in HashSet.
// HashSet also implements Serializable and Cloneable interfaces.

import java.util.*;
import java.util.HashSet;

public class hashSet {
    public static void main(String args[]){
        Set<Integer> hset = new HashSet<>();

        hset.add(1);
        hset.add(99);
        hset.add(23);
        hset.add(34);
        hset.add(4);

        System.out.println(hset);  // notice that elements are not printed in the order they were added

        hset.add(99);
        hset.add(23);  // these elements are not again added in the hset as these are already present inside the hset

        System.out.println(hset);  // duplicated elements are not added and printed

        hset.remove(99);  // remove() method is used to remove and element from the set

        System.out.println(hset.size());  // returns the total size of the set

        System.out.println(hset.contains(99));  // returns boolean value if the element is present inside the set

        System.out.println(hset.isEmpty());  // returns boolean value if the set is empty or not

        hset.clear();  // removes all the elements from the set

        System.out.println(hset.isEmpty()); // this will now return true as we have removed all elements using hset.remove()
    }
}
