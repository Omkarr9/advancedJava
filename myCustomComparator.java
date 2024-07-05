import java.util.*;

public class myCustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2){
        return i2-i1;  // for descending order we do i2-i1 (natural order of Integer is ascending order ie i1-i2)
    }
    // we use two objects in compare method because it is not using any existing class values unlike comparable which onyl takes one object because it already has "this" values from its own class
    // that is one of the difference between using Comparable interface and Comparator interface
}
