// LinkedHashSet is the ordered version of hashSet
// everthing is similar to hashSet but just that the elements are stored and iterated in ordered manner

import java.util.*;

public class linkedHashSet {
    public static void main(String args[]){
        Set<Integer> lset = new LinkedHashSet<>();

        lset.add(1);
        lset.add(99);
        lset.add(23);
        lset.add(34);
        lset.add(4);
        System.out.println(lset);  // notice that elements are printed in the order they were added unlike hashSet where elements were not printed in ordered way

        lset.add(99);
        lset.add(23);  // these elements are not again added in the hset as these are already present inside the hset

        System.out.println(lset);  // duplicated elements are not added and printed

        lset.remove(99);  // remove() method is used to remove and element from the set

        System.out.println(lset.size());  // returns the total size of the set

        System.out.println(lset.contains(99));  // returns boolean value if the element is present inside the set

        System.out.println(lset.isEmpty());  // returns boolean value if the set is empty or not

        lset.clear();  // removes all the elements from the set

        System.out.println(lset.isEmpty()); // this will now return true as we have removed all elements using lset.remove()
    }
    
}
