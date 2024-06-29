import java.util.*;

public class arrayClass {
    public static void main(String args[]){
        // The Arrays class in java.util package is a part of the Java Collection Framework. 
        // This class provides static methods to dynamically create and access Java arrays. 
        // It consists of only static methods and the methods of Object class. The methods of this class can be used by the class name itself.

        int[] numbers = {1,4,5,3,8,2,9,7,6,10};

        Arrays.sort(numbers); // sorts the given array ( uses quick sort to sort the array internally)

        System.out.println(Arrays.binarySearch(numbers,6)); // returns the index position of given element using binary search using the typical log(n) time complexity but the array has to be sorted in order to use this function

        // Arrays.fill(numbers, 69); // fills the entire with given element (usually used while solving dynamic programming problems when we want the array to be filled first with some value)

        for(int i: numbers){
            System.out.print(i+ ", ");
        }
    }
}
