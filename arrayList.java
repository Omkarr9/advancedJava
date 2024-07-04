import java.util.*;


public class arrayList {
    public static void main(String args[]){
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        arr1.add(0, 99);  
        arr1.add(1, 100);
        /*we can add values at particular index position and if any value is already
        present at that position then it will be placed next to that index position */

        arr1.add(0, 101); // we add elements to the arrayList at particular position as many times as we want

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(1000);
        arr2.add(10001);
        arr2.add(1002);
        arr2.add(1003);
        arr2.add(1004);

        arr1.addAll(arr1.size(),arr2); // addAll is used to add a arrayList to an existing arrayList and we also set the index from which we want to add elements
        // all the elements in arr2 are now also been added to arr1 starting from the arr1.size() index position, which was the last index position of original arr1

        // arr1.clear(); // removes all the elements from the arrayList.

        System.out.println(arr1.indexOf(100)); //  return the index of given element in the arrayList and if the element is not present then it return -1
        // indexOf always return the first index of the given element if multiple same elements are present

        System.out.println(arr1.lastIndexOf(1001)); // return the last index of given element in the arrayList

        arr1.remove(0); // removes an element from the specified index

        arr1.set(1,99); // set() replaces the element at the given index unlike add() which only adds element and moves the rest of the elements to the left of the arrayList

        for(int i=0; i<arr1.size(); i++){  // size() is used to get the total length of the arrayList where as we use length() to get total size of the normal array
            System.out.println(arr1.get(i));  // .get(index_value) is used to get the value at that particular index
        }

        System.out.println(arr1.contains(69)); // contains checks if the given value is present in the arrayList or not and return boolean value true or false


        // we can also use Iterator to access each element inside the arrayList
        System.out.println("Using iterator");
        Iterator<Integer> it = arr1.iterator();
        while(it.hasNext()){ // prints elements until the arrayList is finished
            System.out.println(it.next());
        }

        
        // we can also use for each to access arrayList
        System.out.println("Using for-each");
        for(Integer elements : arr1){
            System.out.println("element is "+ elements);
        }
    }
    
}
